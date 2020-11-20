angular.module('modA', ['ngRoute'])
    .factory("IdFactory", function () {
        var factory = {}
        var idVal = 0;
        factory.setId = function (id) {
            idVal = id;
        }
        factory.getId = function () {
            return idVal;
        }
        return factory;
    })

    .filter('genderFormat', function() {
        return function(gender) {
            if(gender==true){
                return "Male";
            }
            return "Female";
        }
    })

    .config(function ($routeProvider) {
        $routeProvider

            .when("/add", {
                templateUrl: "fragments/add.html",
                controller: "addController"
            })
            .when("/delete", {
                templateUrl: "fragments/delete.html",
                controller: "deleteController"
            })
            .when("/update", {
                templateUrl: "fragments/update.html",
                controller: "updateController"
            })
            .when("/select", {
                templateUrl: "fragments/select.html",
                controller: "selectController"
            });
    })
    
    .controller('addController', function ($scope, $location, $http) {
        console.log("add");
        $scope.data = 'Inside add';
        $scope.studentList = {};

        $scope.uploadStudentData = function () {

            $scope.studentList.rollno = $scope.rollno;
            $scope.studentList.name = $scope.name;
            $scope.studentList.age = $scope.age;
            $scope.studentList.email = $scope.email;
            $scope.studentList.date = $scope.dob;
            $scope.studentList.isMale = $scope.gender;
            $http({
                method: "POST",
                url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students',
                data: $scope.studentList,
                success: function () {
                    console.log("add done...");
                    $location.path("/select");
                    alert('Success');
                }
            })

        }

    })
    .controller('deleteController', function ($scope,$http,$location,IdFactory) {
        

            $http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + IdFactory.getId())

            .then(function (response) {
                    console.log("delete");
                    $location.path("/select");
                
                })
            

        
    })
    .controller('updateController', function ($scope, $location, $http, IdFactory) {
        console.log("update");
        $scope.uploadStudentData = function () {
            var url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + IdFactory.getId();
            $http.put(url, {
                "rollNo": $scope.rollno,
                "name": $scope.name,
                "age": $scope.age,
                "email": $scope.email,
                "date": $scope.dob,
                "isMale": $scope.gender
            }).then(function (response) {
                console.log("edit done...");

                 $location.path("/select");

            });
        }
    })
    .controller('selectController', function ($scope, $location, $http, IdFactory) {
        console.log("about");

        $http.get('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students')
            .then(function (response) {

                $scope.students = [];
                for (var i = 0; i < response.data.length; i++) {
                    $scope.students.push(response.data[i]);
                }
            })
        $scope.EditBtn = function (student) {
            console.log("EditBtn");
            IdFactory.setId(student.id);
            console.log(student.id);
            $location.path("/update");

        }
        $scope.DeleteBtn = function (student) {
            console.log("DeleteBtn");
            IdFactory.setId(student.id);
            console.log(student.id);
            $location.path("/delete");

        }

    });
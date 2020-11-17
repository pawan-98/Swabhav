var app = angular.module('myApp', []);
        app.controller('myCtrl', function($scope, $http) {
           $scope.studentList=[];
         $scope.getData=function(){
            $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students")
          .then(function(response) {
              console.log(response.data)
              $scope.studentList=response.data;
              console.log($scope.studentList)
              for (var i = 0; i < response.data.length; i++) {
                $scope.studentList.push(response.data[i]);
            }
            
          });
        }

        
        });
    
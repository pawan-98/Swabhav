
        angular.module('modA', ['ngRoute'])
        .config(function ($routeProvider) {
            $routeProvider
                
                .when("/about", {
                    templateUrl: "fragments/about.html",
                    controller:"aboutController"
                })
                .when("/carrer", {
                    templateUrl: "fragments/carrer.html",
                    controller:"carrerController"
                })
                .when("/home", {
                    templateUrl: "fragments/home.html",
                    controller:"homeController"
                });
        })
    .controller('homeController', function ( $scope) {
        console.log("home");
            $scope.data = 'Inside Home';
        })
    .controller('carrerController', function ( $scope) {
        console.log("carrer");
            $scope.data = 'Inside Carrer';
        })
    .controller('aboutController', function ( $scope) {
        console.log("about");
            $scope.data = 'Inside About';
        });
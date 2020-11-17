
var application = angular.module('modA', []);
application.factory("CounterFactory", function () {
    var CounterFactory = {};
    var count = 0;
    CounterFactory.increment = function () {
        return count++;
    }
    CounterFactory.decrement = function () {
        return count--;
    }
    return CounterFactory;
});
application.controller('IncrementController', function ($rootScope, $scope, CounterFactory) {

    $scope.run = function () {
        $rootScope.getValue = CounterFactory.increment();
    }
});

application.controller('DecrementController', function ($rootScope, $scope, CounterFactory) {

    $scope.run = function () {
        $rootScope.getValue = CounterFactory.decrement();
    }
});
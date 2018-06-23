var app = angular.module('myApp', []);


app.controller('cartaoCtrl', function($scope, $http) {
    $http.get("http://localhost:8080/cartoes")
    .then(function (response) {
    	$scope.cartoes = response.data;
    });
});
var app = angular.module('myApp', []);


app.controller('cartaoCtrl', function($scope, $http) {
    
    var buscarCartoes = function(){
	    $http.get("http://localhost:8080/cartoes")
	    .then(function (response) {
	    	$scope.cartoes = response.data;
	    });
    }

    var deletarCartao = function(id){
	    $http.delete("http://localhost:8080/cartoes/deletar/" + id)
	    .then(function (response) {
	    	alert("sucesso");
	    });
    }

    var init = function(){
    	deletarCartao(34);  	
    	buscarCartoes(); 
    }

    init();
});
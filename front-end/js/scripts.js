var app = angular.module('myApp', []);


app.controller('cartaoCtrl', function($scope, $http) {
    
	$scope.cartoes = null;

    var buscarCartoes = function(){
	    $http.get("http://localhost:8080/cartoes")
	    .then(function (response) {
	    	$scope.cartoes = response.data;
	    });
    }

    $scope.deletarCartao = function(id){
	    $http.delete("http://localhost:8080/cartoes/deletar/" + id)
	    .then(function (response) {
	    	if(response.data == true){
	    		buscarCartoes();
	    		alert("sucesso");
	    	}else{
	    		alert("erro");
	    	}
	    });
    }

    var init = function(){
    	buscarCartoes(); 
    }

    init();
});
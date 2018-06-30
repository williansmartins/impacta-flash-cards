var app = angular.module('myApp', []);


app.controller('cartaoCtrl', function($scope, $http) {
    
	$scope.cartoes = null;

    var buscarCartoes = function(){
	    $http.get("http://172.16.16.1:8080/cartoes")
	    .then(function (response) {
	    	$scope.cartoes = response.data;
	    });
    }

    $scope.deletarCartao = function(id){
	    $http.delete("http://172.16.16.1:8080/cartoes/deletar/" + id)
	    .then(function (response) {
	    	if(response.data == true){
	    		buscarCartoes();
	    		console.info("sucesso");
	    	}else{
	    		console.info("erro");
	    	}
	    });
    }

    var inserirCartao = function(){
    	var cartao={
    		"idiomaOrigem":"TESTE",
			 "idiomaDestino":"Polonês",
			 "textoOrigem":"oi",
			 "textoDestino":"cześć",
			 "nivel":"1"
    	};

	    $http({
			method: 'POST',
			url: "http://172.16.16.1:8080/cartoes",
			data: cartao
			})
			.then(function (success) {
				console.info("success");
			}, function (error) {
			  	console.info("ERRO");
		});
    }

    var init = function(){
    	buscarCartoes(); 
    }

    init();
});
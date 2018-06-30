var app = angular.module('myApp', []);


app.controller('cartaoCtrl', function($scope, $http) {
    
	$scope.cartoes = null;
	$scope.cartao = null;

	$scope.popularCampos = function(){
		$scope.cartao={
			"idiomaOrigem"	: "idiomaOrigem",
			"idiomaDestino"	: "idiomaDestino",
			"textoOrigem"	: "textoOrigem",
			"textoDestino"	: "textoDestino",
			"nivel"			: "1"
    	};
	}

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

    $scope.inserirCartao = function(){
   	    $http({
			method: 'POST',
			url: "http://172.16.16.1:8080/cartoes",
			data: $scope.cartao
			})
			.then(function (success) {
				console.info("success");
				buscarCartoes();
				$scope.cartao = null;
			}, function (error) {
			  	console.info("ERRO");
		});
    }

    var init = function(){
    	buscarCartoes(); 
    }

    init();
});
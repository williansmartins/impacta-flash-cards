var app = angular.module('myApp', []);


app.controller('cartaoCtrl', function($scope, $http) {
    
	$scope.cartoes = null;
	$scope.cartao = null;
	$scope.cartaoSelecionado = null;
	$scope.tela = 3;
	$scope.textoOrigem = true;
	$scope.posicao = 0;

    $scope.selecionarCartao = function(cartao){
	    $scope.cartaoSelecionado = cartao;
    }

    $scope.trocarNivel = function(nivel){
	    alert(nivel);
    }

    $scope.modificarNivel = function(valor){
	    alert(valor);
    }

    $scope.mudarPosicao = function(valor){
    	$scope.posicao = $scope.posicao + valor;
	    $scope.cartaoAtual = $scope.cartoes[$scope.posicao];
    }

    var buscarCartoes = function(){
	    $http.get("http://172.16.16.1:8080/cartoes")
	    .then(function (response) {
	    	$scope.cartoes = response.data;
	    	$scope.cartaoAtual = $scope.cartoes[$scope.posicao];
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
			data: $scope.cartaoSelecionado
			})
			.then(function (success) {
				console.info("success");
				buscarCartoes();
				$scope.cartaoSelecionado = null;
			}, function (error) {
			  	console.info("ERRO");
		});
    }

    var init = function(){
    	buscarCartoes(); 
    	$("#nivel").mask("9");
    	// $('#nivel').inputmask({
     //        mask: "99:59:59",
     //        definitions: {'5': {validator: "[0-5]"}}
    	// });
    }

    init();
});
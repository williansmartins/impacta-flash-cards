var app = angular.module('myApp', []);


app.controller('cartaoCtrl', function($scope, $http, $filter) {
    
	$scope.cartoes = null;
	$scope.cartao = null;
	$scope.cartaoSelecionado = null;
	$scope.tela = 3;
	$scope.textoOrigem = true;
	$scope.posicao = 0;

	$scope.um = false;
	$scope.dois = false;
	$scope.tres = false;
	$scope.quatro = false;

    $scope.selecionarCartao = function(cartao){
	    $scope.cartaoSelecionado = cartao;
    }

    $scope.excluirTudo = function(cartao){
	    $http({
			method: 'DELETE',
			url: "http://172.16.16.1:8080/cartoes/deletar"
			})
			.then(function (success) {
				console.info("success");
				buscarCartoes();
			}, function (error) {
			  	console.info("ERRO");
		});
    }

    $scope.trocarNivel = function(nivel){
		$scope.cartaoAtual.nivel = nivel;
		$scope.cartaoSelecionado = $scope.cartaoAtual;
		$scope.inserirCartao();
		$scope.mudarPosicao(1);
    }

    $scope.modificarNivel = function(valor){
    	$scope.cartaoSelecionado = $scope.cartaoAtual;
    	var nivelCalq = $scope.cartaoSelecionado.nivel + valor;

    	if ((nivelCalq >= 1) && (nivelCalq <=4)) {
    		
    		$scope.cartaoSelecionado.nivel = nivelCalq;
	    	$scope.inserirCartao();
	    }
	    
	    $scope.mudarPosicao(1);
    }

    $scope.mudarPosicao = function(valor){    	
    	var posicaoCalq = $scope.posicao + valor;

		if ( (posicaoCalq >=0) && (posicaoCalq<$scope.cartoes.length)){
			$scope.posicao = posicaoCalq;        
	    	$scope.cartaoAtual = $scope.cartoes[$scope.posicao];
		}
    	
    }

    var buscarCartoes = function(){
	    $http.get("http://172.16.16.1:8080/cartoes")
	    .then(function (response) {
	    	$scope.cartoes = response.data;
	    	$scope.cartoes = $filter('orderBy')($scope.cartoes, 'id');
	    	$scope.cartaoAtual = $scope.cartoes[$scope.posicao];
	    });
    }

    $scope.buscarCartoesPorCategoria = function(){
    	var um = $scope.um;
    	var dois = $scope.dois;
    	var tres = $scope.tres;
    	var quatro = $scope.quatro;

	    $http.get("http://172.16.16.1:8080/cartoes/nivel?um="+um+"&dois="+dois+"&tres="+tres+"&quatro="+quatro)
	    .then(function (response) {
	    	$scope.cartoes = response.data;
	    	$scope.cartoes = $filter('orderBy')($scope.cartoes, 'id');
	    	$scope.cartaoAtual = $scope.cartoes[$scope.posicao];
	    });
    }

	$scope.deletarCartao = function(id){
	swal({
		title: "EXCLUIR ?",
		text: "Tem certeza que deseja excluir este registro ?",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	  })
	  .then((willDelete) => {
		if (willDelete) {
		$http.delete("http://172.16.16.1:8080/cartoes/deletar/" + id)
			.then(function (response) {
				if(response.data == true){
					buscarCartoes();
					console.info("sucesso");
				}else{
					console.info("erro");
				}
		});
		swal("Deletado com sucesso!", {
		icon: "success",
		});
		} else {
		  swal("Ufa, quase foi deletado!");
		}
	  });
	};

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
    }

    init();
});
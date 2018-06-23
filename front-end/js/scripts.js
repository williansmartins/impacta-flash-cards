$( document ).ready(function() {
	$.get( "http://localhost:8080/cartoes", function( data ) {
	  //console.info( data );

  	//$("#tabela #corpo").empty();
	
	for (var i = 0; i < data.length; i++) {
		var cartao = data[i];
		//console.info( cartao.id );
		$("#tabela #corpo").append(" \
			<tr> \
				<td>" + cartao.id + "</td> \
				<td>" + cartao.idiomaOrigem + "</td> \
				<td>" + cartao.idiomaDestino + "</td> \
			</tr> \
		");
	};

	});
});
$( document ).ready(function() {
	$.get( "backend.txt", function( data ) {
	  alert( "Data Loaded: " + data );
	});
});

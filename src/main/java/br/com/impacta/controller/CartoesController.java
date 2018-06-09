package br.com.impacta.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.impacta.model.Cartao;


@Controller
@RequestMapping("/cartoes")
public class CartoesController {
	

	@RequestMapping(value="", method=RequestMethod.POST)  
	@ResponseBody
	public Cartao inserir(@RequestBody Cartao entrada) {
		return entrada;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.PUT)  
	@ResponseBody
	public Cartao inserir(@RequestBody Cartao entrada, @PathVariable Long id) {
		System.out.println("atulizar" + id);
		System.out.println("atulizar2" + entrada);
		return entrada;
	}

	@RequestMapping(value="/deletar/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public boolean deletar(@PathVariable long id) {
		System.out.println("deletando id: "+id);
		return false;
	}

	@RequestMapping(value = "/deletar", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deletar() {
		System.out.println("deletando Tudo ");
		return false;
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	public Cartao buscar1(@PathVariable Long id) {

		System.out.println("id: " + id);

		return new Cartao();
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public Cartao buscar() {

		System.out.println("Buscar tudo" );

		return new Cartao();
	}
	
	@RequestMapping(value="/nivel", 
			method=RequestMethod.GET,
			params = {"um", "dois", "tres", "quatro"})  
	@ResponseBody
	public Cartao buscaPorCategorias(
			@RequestParam(value = "um") boolean um, 
			@RequestParam(value = "dois") boolean dois,
			@RequestParam(value = "tres") boolean tres, 
			@RequestParam(value = "quatro") boolean quatro) {
		
		System.out.println("Nivel: " + um);
		System.out.println("Nivel: " + dois);
		System.out.println("Nivel: " + tres);
		System.out.println("Nivel: " + quatro);
		
		return new Cartao();
	}
}

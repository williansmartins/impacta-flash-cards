package br.com.impacta.controller;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cartoes")
public class CartoesController {

//	@RequestMapping(value="/inserir", method=RequestMethod.POST)  
//	@ResponseBody
//	public void inserir() {
//		return entrada;
//	}
//
//	@RequestMapping(value="/buscar", method=RequestMethod.GET)  
//	@ResponseBody
//	public Despesa buscar() {
//		Despesa despesa = new Despesa();
//		despesa.setCategoria(Categoria.ALIMENTACAO);
//		despesa.setCodigo(1l);
//		despesa.setData(new Date());
//		despesa.setDescricao("descricao");
//		despesa.setObservacoes("observacoes");
//		despesa.setValor(new BigDecimal(123.45));
//		return despesa;
//	}
//	
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
//	
//	@RequestMapping(value="/buscarQualquerCoisa", 
//			method=RequestMethod.GET,
//			params = {"parametro"})  
//	@ResponseBody
//	public Despesa buscarQualquerCoisa(
//			@RequestParam(value = "parametro") boolean parametro, 
//			@RequestParam(value = "dois") boolean dois) {
//		
//		System.out.println("um: " + um);
//		System.out.println("dois: " + dois);
//		
//		return new Despesa();
//	}
//
//	public void atualizar() {
//
//	}
//
//	@RequestMapping(value="/deletar/{id}/{outra}", method=RequestMethod.DELETE)  
//	@ResponseBody
//	public boolean deletar(@PathVariable Long id, @PathVariable String outra) {
//		System.out.println("deletando..." + id);
//		System.out.println("deletando..." + outra);
//		return false;
//	}
}

package br.com.impacta.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.impacta.model.Cartao;
import br.com.impacta.repository.CartaoRepository;


@Controller
@RequestMapping("/cartoes")
@CrossOrigin(origins = "http://localhost")
public class CartoesController {
	
	@Autowired
	private CartaoRepository dao;
	
	@Autowired
	private CartaoRepository dao2;
	
	@RequestMapping(value="", method=RequestMethod.POST)  
	@ResponseBody
	public Cartao inserir(@RequestBody Cartao entrada) {
		dao.save(entrada);
		return entrada;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.PUT)  
	@ResponseBody
	public Cartao atualizar(@RequestBody Cartao entrada, @PathVariable Long id) {
		System.out.println("atualizando id: " + id);
		System.out.println("atualizar cartao: " + entrada);
		
		entrada.setId(id);
		
		try {
			dao.save(entrada);
			return entrada;
		} catch (Exception e) {
			return new Cartao();
		}
	}

	@RequestMapping(value="/deletar/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public boolean deletar(@PathVariable long id) {
		System.out.println("deletando id: "+id);
		try{
			dao.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@RequestMapping(value = "/deletar", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deletar() {
		System.out.println("deletando Tudo ");
		
		try{
			dao.deleteAll();
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	public Cartao buscar1(@PathVariable Long id) {

		System.out.println("buscando cartao pelo id: " + id);
		
		try{
			Cartao cart = dao.findById(id).get();
			return cart;
		}catch (Exception e) {
			return new Cartao();
		}
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<Cartao> buscar() {
		System.out.println("Buscando tudo");
		
		try{
			List<Cartao> cartoes = dao.findAll();
			return cartoes;
		}catch (Exception e) {
			return new ArrayList<>();
		}
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

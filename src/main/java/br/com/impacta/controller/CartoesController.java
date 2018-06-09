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

import br.com.impacta.model.Cartao;

@Controller
@RequestMapping("/cartoes")
public class CartoesController {

	// @RequestMapping(value="/inserir", method=RequestMethod.POST)
	// @ResponseBody
	// public void inserir() {
	// return entrada;
	// }
	//
	// @RequestMapping(value="/buscar", method=RequestMethod.GET)
	// @ResponseBody
	// public Despesa buscar() {
	// Despesa despesa = new Despesa();
	// despesa.setCategoria(Categoria.ALIMENTACAO);
	// despesa.setCodigo(1l);
	// despesa.setData(new Date());
	// despesa.setDescricao("descricao");
	// despesa.setObservacoes("observacoes");
	// despesa.setValor(new BigDecimal(123.45));
	// return despesa;
	// }
	//
	// @RequestMapping(value="/buscar2",
	// method=RequestMethod.GET,
	// params = {"um", "dois"})
	// @ResponseBody
	// public Despesa buscarMultiplosParametros(
	// @RequestParam(value = "um") boolean um,
	// @RequestParam(value = "dois") boolean dois) {
	//
	// System.out.println("um: " + um);
	// System.out.println("dois: " + dois);
	//
	// return new Despesa();
	// }
	//
	// @RequestMapping(value="/buscarQualquerCoisa",
	// method=RequestMethod.GET,
	// params = {"parametro"})
	// @ResponseBody
	// public Despesa buscarQualquerCoisa(
	// @RequestParam(value = "parametro") boolean parametro,
	// @RequestParam(value = "dois") boolean dois) {
	//
	// System.out.println("um: " + um);
	// System.out.println("dois: " + dois);
	//
	// return new Despesa();
	// }
	//
	// public void atualizar() {
	//
	// }
	//
	// @RequestMapping(value="/deletar/{id}/{outra}",
	// method=RequestMethod.DELETE)
	// @ResponseBody
	// public boolean deletar(@PathVariable Long id, @PathVariable String outra)
	// {
	// System.out.println("deletando..." + id);
	// System.out.println("deletando..." + outra);
	// return false;
	// }

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
	
	
}

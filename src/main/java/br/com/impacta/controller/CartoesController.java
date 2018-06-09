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
}

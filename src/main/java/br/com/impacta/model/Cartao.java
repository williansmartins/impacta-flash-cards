
package br.com.impacta.model;

import javax.persistence.Entity;

@Entity
public class Cartao {
	
	private Long id;
	
	private String idiomaOrigem;
	
	private String idiomaDestino;
	
	private String textoOrigem;
	
	private String textoDestino;
	
	private Long nivel;

	public String getIdiomaOrigem() {
		return idiomaOrigem;
	}

	public void setIdiomaOrigem(String idiomaOrigem) {
		this.idiomaOrigem = idiomaOrigem;
	}

	public String getIdiomaDestino() {
		return idiomaDestino;
	}

	public void setIdiomaDestino(String idiomaDestino) {
		this.idiomaDestino = idiomaDestino;
	}

	public String getTextoOrigem() {
		return textoOrigem;
	}

	public void setTextoOrigem(String textoOrigem) {
		this.textoOrigem = textoOrigem;
	}

	public String getTextoDestino() {
		return textoDestino;
	}

	public void setTextoDestino(String textoDestino) {
		this.textoDestino = textoDestino;
	}

	public Long getNivel() {
		return nivel;
	}

	public void setNivel(Long nivel) {
		this.nivel = nivel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
		
}

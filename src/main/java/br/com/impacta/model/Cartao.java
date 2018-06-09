package br.com.impacta.model;

public class Cartao {
	
	private String idiomaOrigem;
	
	private String idiomaDestino;
	
	private String textoOrigem;
	
	private String textoDistino;
	
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

	public String getTextoDistino() {
		return textoDistino;
	}

	public void setTextoDistino(String textoDistino) {
		this.textoDistino = textoDistino;
	}

	public Long getNivel() {
		return nivel;
	}

	public void setNivel(Long nivel) {
		this.nivel = nivel;
	}
	
		
}


package br.com.impacta.model;

import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
>>>>>>> e8f3db4b2c7b2dbda8f08ca6c1a661a36a028816

@Entity
public class Cartao {
	
	@Id @GeneratedValue
	private Long id;
	
	private String idiomaOrigem;
	
	private String idiomaDestino;
	
	private String textoOrigem;
	
	private String textoDestino;
	
	private Long nivel;

	public Cartao(Long id, String idiomaOrigem, String idiomaDestino, String textoOrigem, String textoDestino,
			Long nivel) {
		super();
		this.id = id;
		this.idiomaOrigem = idiomaOrigem;
		this.idiomaDestino = idiomaDestino;
		this.textoOrigem = textoOrigem;
		this.textoDestino = textoDestino;
		this.nivel = nivel;
	}

<<<<<<< HEAD
=======
	public Cartao() {
		// TODO Auto-generated constructor stub
	}

>>>>>>> e8f3db4b2c7b2dbda8f08ca6c1a661a36a028816
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
	
	@Override
	public String toString() {
		return "Cartao [id=" + id + ", idiomaOrigem=" + idiomaOrigem + ", idiomaDestino=" + idiomaDestino
				+ ", textoOrigem=" + textoOrigem + ", textoDestino=" + textoDestino + ", nivel=" + nivel + "]";
	}
	
	
		
}
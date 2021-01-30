package com.eventoapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Convidado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idConvidado;
	
	private String rg;
	private String nomeConvidado;
	
	@ManyToOne
	private Evento evento;
	
	
	public int getIdConvidado() {
		return idConvidado;
	}
	public void setIdConvidado(int idConvidado) {
		this.idConvidado = idConvidado;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	
	
}

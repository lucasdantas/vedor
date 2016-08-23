package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Bairro extends Model{
	
	public String nome;
	
	@Enumerated(EnumType.STRING)
	public Setor setor;
	
	@ManyToOne
	public Municipio municipio;
}
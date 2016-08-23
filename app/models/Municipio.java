package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Municipio extends Model{
	
	public String nome;
	public String estado;
	
	@OneToMany(mappedBy="municipio")
	public List<Bairro> bairros;
}
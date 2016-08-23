package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import play.db.jpa.Model;

@Entity
public class Operador extends Model{
	public String email;
	public String nome;
	public String senha;
}
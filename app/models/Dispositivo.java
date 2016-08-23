package models;

import play.db.jpa.Model;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Dispositivo extends Model 
{
	
	public String nome;
	public String mac;
	public String descricao;
	public String latitude;
	public String longitude;

}

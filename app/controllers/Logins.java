package controllers;

import models.Operador;
import play.mvc.Controller;

public class Logins extends Controller{
	
	public static void login(Operador operador){
		Operador op = Operador.find("email=? and senha=?", operador.email, operador.senha).first();
		
		if(op==null){
			flash.error("Email e/ou senha incorreto(s)");
			Operadores.index(operador.email);
		}
		else{			
			String[] nomeMenor = op.nome.split(" ");
			
			session.put("id", op.id);
			session.put("nome", nomeMenor[0] + " " + nomeMenor[1]);
			Operadores.menu();
		}
	}
	
	public static void logout(){
		session.clear();
		Operadores.index(null);
	}
}
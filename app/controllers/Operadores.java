package controllers;

import java.util.Collections;
import java.util.List;
import models.Operador;
import play.mvc.Controller;

public class Operadores extends Controller{
	
	public static void index(String email){
		if(email == null){
			render();
		}
		else{
			render(email);
		}
	}	
	
	public static void cadastro(){
		render();
	}
	
	public static void salvar(Operador operador){
		Operador op = Operador.find("email=?", operador.email).first();
		if(op==null){
			operador.save();
			menu();
		}
		else{
			flash.error("Email já cadastrado");
			cadastro();
		}
	}
	
	public static void editar(Operador operador){
			operador.save();
			flash.success("Perfil editado com sucesso");
			perfil(operador.id);
	}
	
	public static void menu(){
		render();
	}
	
	public static void listar(String pesquisa){
		List<Operador> operadores = Collections.emptyList();
		
		if(pesquisa == null || pesquisa.trim().isEmpty()){
			operadores = Operador.findAll();
		}
		else{
			operadores = Operador.find("email like ? or nome like ?", "%" + pesquisa + "%", "%" + pesquisa + "%").fetch();
		}
		
		for (int x=0; x<operadores.size(); x++) {
			if(operadores.get(x).nome.equals("root") && operadores.get(x).email.equals("root")){
				operadores.remove(x);
			}
			if(operadores.get(x).id.equals(session.get("id"))){
				operadores.remove(x);
			}
		}
		
		render(operadores,pesquisa);
	}
	
	public static void perfil(Long id){
		Operador operador = Operador.findById(id);
		render(operador);
	}
	
	public static void configuracoes(Long id){
		Operador operador = Operador.findById(id);
		render(operador);
	}
}
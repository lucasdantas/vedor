package controllers;

import java.util.Collections;
import java.util.List;

import models.Dispositivo;
import play.mvc.Controller;

public class Dispositivos extends Controller{
	
	public static void cadastro(Long id){
		if (id ==null) {
			render();
		}
		else {
			Dispositivo dispositivo = Dispositivo.findById(id);
			render(dispositivo);
		}
	}
	
	public static void salvar(Dispositivo dispositivo){
		dispositivo.save();
		//Ver como exibe alertDialogno Play
		//exibir(dispositivo);
		listar();
	}
	
	public static void exibir(Dispositivo dispositivo){
		render(dispositivo);
	}
	
	public static void listar(){
		List<Dispositivo> dispositivos = Collections.emptyList();
				
		//Listando todos os dispositivos
		dispositivos = Dispositivo.findAll();
		render(dispositivos);
	}
	
	public static void deletar(Long id){
		Dispositivo dispositivo = Dispositivo.findById(id);
		dispositivo.delete();
		listar();
	}
	
	public static void editar(Long id){
		Dispositivo dispositivo = Dispositivo.findById(id);
		cadastro(dispositivo.id);
	}
	
	public static void listar(String pesquisa){

		List<Dispositivo> dispositivos = Collections.emptyList();
		
		if(!(pesquisa == null || pesquisa.trim().isEmpty())){
			dispositivos = Dispositivo.find("nome like ? or mac like ?", "%"+pesquisa+"%", "%"+pesquisa+"%").fetch();
		}
		else{
			dispositivos = Dispositivo.findAll(); 
		}
		
		render(dispositivos, pesquisa);
	}
}
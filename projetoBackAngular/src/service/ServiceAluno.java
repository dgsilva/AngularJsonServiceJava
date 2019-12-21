package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.gson.Gson;

import manager.BeanAluno;

//copiar os .jar do Gilson ou json ( e colcar web-inf)/lib
@Path("/aluno")
public class ServiceAluno {

	
 @GET
 public String listar() {
	 try {
	 return new Gson().toJson(BeanAluno.alunos);
	 }catch(Exception ex) {
		 return null;
	 }
 }
 
 
 
 
 
 
 
	
	
}

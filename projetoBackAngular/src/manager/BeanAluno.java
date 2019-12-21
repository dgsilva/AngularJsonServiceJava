package manager;

import java.util.ArrayList;
import java.util.List;

import entity.Aluno;

public class BeanAluno {
	      //Aluno[] --Angular
	//CorsFilter é o detalhe Abre o Serviço (ser visualizado)
	public static List<Aluno> alunos= new ArrayList<>();
	
	static {
		alunos.add(new Aluno(10,"lu","java",10.,10.)
				  .gerarMedia().gerarSituacao());
		alunos.add(new Aluno(11,"xuxean","java",8.,8.)
				  .gerarMedia().gerarSituacao());
		alunos.add(new Aluno(12,"zequinha","java",8.,10.)
				  .gerarMedia().gerarSituacao());
	}
	
	
	
	
	
	
	
	

}

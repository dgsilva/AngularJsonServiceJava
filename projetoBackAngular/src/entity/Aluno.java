package entity;

public class Aluno {

	private Integer idAluno;
	private String nome;
	private String disciplina;
	private Double nota1;
	private Double nota2;
	private Double media;
	private String situacao;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer idAluno, String nome, String disciplina, Double nota1, Double nota2) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public Aluno gerarMedia(){
		this.media = (this.nota1+ this.nota2)/2;
		return this;
	}
	
	public Aluno gerarSituacao(){
		this.situacao = (this.media >=7 )? "Aprovado":
			(this.media >=5)? "recuperacao" :"reprovado";
		return this;
	}
	
	
	
}

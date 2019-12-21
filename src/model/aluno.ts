export class Aluno{
    idAluno:number;
    nome:string;
    disciplina:string;
    nota1:number;
    nota2:number;
    media:number;
    situacao:string;

    constructor(idAluno?:number,nome?:string,disciplina?:string,nota1?:number,nota2?:number,media?:number,situacao?:string){
      this.idAluno=idAluno;
      this.nome=nome;
      this.disciplina=disciplina;
      this.nota1=nota1;
      this.nota2=nota2;
    }

 
    public calcularMedia(): Aluno {
        this.media=(this.nota1+this.nota2)/2;
        return this;
    }

    public gerarSituacao():Aluno{
this.situacao = (this.media>=7)? "Aprovado" :
   (this.media >=5)? "Recuperacao":"Reprovado";
   return this;

    }
}
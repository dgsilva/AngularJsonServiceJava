import { Component, OnInit } from '@angular/core';
import { Aluno } from 'src/model/aluno';
import { AlunoService } from '../aluno.service';

@Component({
  selector: 'app-aluno',
  templateUrl: './aluno.component.html',
  styleUrls: ['./aluno.component.css']
})
export class AlunoComponent implements OnInit {
  aluno: Aluno;
  alunos=[{
    idAluno:1,
    nome:"Diego",
    disciplina:"Java",
    nota1:8.0,
    nota2:8.0,
    media:8.0,
    situacao:"Aprovado"
    },
    {
      idAluno:2,
      nome:"Suelen",
      disciplina:"C#",
      nota1:8.0,
      nota2:8.0,
      media:8.0,
      situacao:"Aprovado"
      }
    ] as Aluno[]

  constructor(private service:AlunoService) {
    this.aluno = new Aluno();
   }

  ngOnInit() {
    this.listar();
    this.fullstack();
  }

  public fullstack(){
    this.alunos = [];
    this.service.findAll().subscribe(res =>{
      this.alunos = res;
    })
    
}

  public calcular(){
    this.aluno.calcularMedia().calcularMedia();
  }

  public listar(){
    return this.alunos
  }

  public adicionar(){
    this.alunos.push(this.aluno);
    this.aluno = new Aluno();
    this.listar();
  }



}

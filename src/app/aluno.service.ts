import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Aluno } from 'src/model/aluno';

@Injectable({
  providedIn: 'root'
})
export class AlunoService {

  constructor(private http:HttpClient) { }
  public findAll(){
    return this.http.get<Aluno[]>
  ("http://localhost:1239/projetoBackAngular/rs/aluno")
  }
}




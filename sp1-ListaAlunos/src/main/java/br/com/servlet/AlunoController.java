package br.com.servlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class AlunoController {
	
	public AlunoModel objAlunoModel = new AlunoModel();
	public List<AlunoModel> listaAluno = new ArrayList<AlunoModel>();
	
	public void AdicionarAlunoMock() {
		 objAlunoModel.Nome = "José";
		 objAlunoModel.Registro = "RA 1";
		 objAlunoModel.NomeCurso = "Análise e Desenvolvimento de Sistemas";
		 listaAluno.add(objAlunoModel);
		 
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Maria";
		 objAlunoModel.Registro = "RA 2";
		 objAlunoModel.NomeCurso = "Análise e Desenvolvimento de Sistemas";
		 listaAluno.add(objAlunoModel);
		 
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "João";
		 objAlunoModel.Registro = "RA 3";
		 objAlunoModel.NomeCurso = "Análise e Desenvolvimento de Sistemas";
		 listaAluno.add(objAlunoModel);
		 
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Luciana";
		 objAlunoModel.Registro = "RA 4";
		 objAlunoModel.NomeCurso = "Ciência da Computação";
		 listaAluno.add(objAlunoModel);
		 
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Pedro";
		 objAlunoModel.Registro = "RA 5";
		 objAlunoModel.NomeCurso = "Ciência da Computação";
		 listaAluno.add(objAlunoModel);
		 
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Juliana";
		 objAlunoModel.Registro = "RA 6";
		 objAlunoModel.NomeCurso = "Ciência da Computação";
		 listaAluno.add(objAlunoModel);
		 
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Denise";
		 objAlunoModel.Registro = "RA 7";
		 objAlunoModel.NomeCurso = "Ciência da Computação";
		 listaAluno.add(objAlunoModel);
		 
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Luiz";
		 objAlunoModel.Registro = "RA 8";
		 objAlunoModel.NomeCurso = "Sistemas de Informação";
		 listaAluno.add(objAlunoModel);
		 
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Olga";
		 objAlunoModel.Registro = "RA 9";
		 objAlunoModel.NomeCurso = "Sistemas de Informação";
		 listaAluno.add(objAlunoModel);
		 
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Manoel";
		 objAlunoModel.Registro = "RA 10";
		 objAlunoModel.NomeCurso = "Sistemas de Informação";
		 listaAluno.add(objAlunoModel);
	}
	
	public void OrdenarListarAluno() {
		 Collections.sort(listaAluno);
	} 
}
		 	



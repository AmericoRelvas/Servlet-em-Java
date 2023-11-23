package br.com.servlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class AlunoController {
	
	// Instância da classe de modelo AlunoModel
		public AlunoModel objAlunoModel = new AlunoModel();
		
		// Lista de alunos não ordenada
		public List<AlunoModel> listaAluno = new ArrayList<AlunoModel>();
		
		// Lista de alunos ordenada
		public List<AlunoModel> listaAlunoOrdenada = new ArrayList<AlunoModel>();

	    // Método para adicionar alunos fictícios (mock) à lista
		public void AdicionarAlunoMock() {
		// Aluno 1
		 objAlunoModel.Nome = "José";
		 objAlunoModel.Registro = "RA 1";
		 objAlunoModel.NomeCurso = "Análise e Desenvolvimento de Sistemas";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
		// Aluno 2
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Maria";
		 objAlunoModel.Registro = "RA 2";
		 objAlunoModel.NomeCurso = "Análise e Desenvolvimento de Sistemas";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
		// Aluno 3
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "João";
		 objAlunoModel.Registro = "RA 3";
		 objAlunoModel.NomeCurso = "Análise e Desenvolvimento de Sistemas";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
		// Aluno 4
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Luciana";
		 objAlunoModel.Registro = "RA 4";
		 objAlunoModel.NomeCurso = "Ciência da Computação";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
		// Aluno 5
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Pedro";
		 objAlunoModel.Registro = "RA 5";
		 objAlunoModel.NomeCurso = "Ciência da Computação";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
		// Aluno 6
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Juliana";
		 objAlunoModel.Registro = "RA 6";
		 objAlunoModel.NomeCurso = "Ciência da Computação";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
		// Aluno 7
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Denise";
		 objAlunoModel.Registro = "RA 7";
		 objAlunoModel.NomeCurso = "Ciência da Computação";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
		// Aluno 8
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Luiz";
		 objAlunoModel.Registro = "RA 8";
		 objAlunoModel.NomeCurso = "Sistemas de Informação";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
		// Aluno 9
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Olga";
		 objAlunoModel.Registro = "RA 9";
		 objAlunoModel.NomeCurso = "Sistemas de Informação";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
		// Aluno 10
		 objAlunoModel = new AlunoModel();
		 objAlunoModel.Nome = "Manoel";
		 objAlunoModel.Registro = "RA 10";
		 objAlunoModel.NomeCurso = "Sistemas de Informação";
		 listaAluno.add(objAlunoModel);
		 listaAlunoOrdenada.add(objAlunoModel);
	}
	
		// Método para ordenar a lista de alunos
		public void OrdenarListarAluno() {
			 // Utiliza o método sort da classe Collections, que usa a implementação compareTo de AlunoModel
			 Collections.sort(listaAlunoOrdenada);
		} 
		
	    // Método para adicionar um novo aluno à lista
		public void AdicionarAluno(String nomeAluno, String registro, String nomeCurso) {
			if(nomeAluno!=null && registro!=null && nomeCurso!=null) {
				objAlunoModel = new AlunoModel();
				objAlunoModel.Nome = nomeAluno;
				objAlunoModel.Registro = registro;
				objAlunoModel.NomeCurso = nomeCurso;
				listaAluno.add(objAlunoModel);
				listaAlunoOrdenada.add(objAlunoModel);
			}
		}
				
	    // Método para filtrar alunos por nome
		public List<AlunoModel> FiltrarAlunoPorNome(String nomeAlunoFiltro) {
			if(nomeAlunoFiltro!=null) {
				List<AlunoModel> listaAlunoFiltro = new ArrayList<AlunoModel>();
				for(AlunoModel aluno: listaAluno) {
					if(aluno.Nome.contains(nomeAlunoFiltro))
						listaAlunoFiltro.add(aluno);
				}
				return listaAlunoFiltro;
			}
			else {
				return listaAluno;
			}
		}
	}
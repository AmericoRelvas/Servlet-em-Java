package br.com.servlet;

public class AlunoModel implements Comparable<AlunoModel> {

	public String Nome = "";
	public String Registro = "";
	public String NomeCurso = "";

	@Override
	public int compareTo(AlunoModel o) {
		// TODO Auto-generated method stub
		return this.Nome.compareTo(o.Nome);
	}
}

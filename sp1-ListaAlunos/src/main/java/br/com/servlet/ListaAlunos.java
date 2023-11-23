package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ListaAlunos extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saidaHtml = response.getWriter();
		AlunoController objAluno = new AlunoController();
		
		objAluno.AdicionarAlunoMock();
		
		saidaHtml.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"pt-br\" xml:lang=\"pt-br\">");
		saidaHtml.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'/>");
		saidaHtml.println("<body>");
		saidaHtml.println("Situação Problema 1 - Lista de alunos <br>");
		saidaHtml.println("<b>Ordenação Original</b>");
		saidaHtml.println("<table>");
		for(AlunoModel aluno: objAluno.listaAluno) {
			saidaHtml.println("<tr>");
			saidaHtml.println("<td>" + aluno.Nome + "</td>");
			saidaHtml.println("<td>" + aluno.Registro + "</td>");
			saidaHtml.println("<td>" + aluno.NomeCurso + "</td>");
			saidaHtml.println("</tr>");
		}
		saidaHtml.println("</table>");
		saidaHtml.println("<b>Ordem alfabética</b>");
		
		objAluno.OrdenarListarAluno();
		saidaHtml.println("<table>");
		for(AlunoModel aluno: objAluno.listaAluno) {
			saidaHtml.println("<tr>");
			saidaHtml.println("<td>" + aluno.Nome + "</td>");
			saidaHtml.println("<td>" + aluno.Registro + "</td>");
			saidaHtml.println("<td>" + aluno.NomeCurso + "</td>");
			saidaHtml.println("</tr>");
		}
		saidaHtml.println("</table>");
		saidaHtml.println("</body>");
		saidaHtml.println("</html>");
	}
}


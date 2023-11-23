package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ListaAlunos extends HttpServlet {
	
	// Lista de alunos filtrados
		List<AlunoModel> listaAlunoFiltro = new ArrayList<AlunoModel>();
		
	    // Instância da classe de controle AlunoController
		AlunoController objAluno = new AlunoController();
		
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter saidaHtml = response.getWriter();
			
	        // Verifica se a lista de alunos está vazia e adiciona alunos fictícios (mock) se necessário
			if(objAluno.listaAluno.size()==0) {
				 objAluno.AdicionarAlunoMock();
			}
			
	        // Obtém parâmetros do formulário
			String nome = request.getParameter("nomeAluno");
			String registro = request.getParameter("registro");
			String nomeCurso = request.getParameter("nomeCurso");
			
	        // Adiciona um novo aluno se os parâmetros não forem nulos
			if(nome!=null && registro!=null && nomeCurso!=null) {
				objAluno.AdicionarAluno(nome, registro, nomeCurso);
			}
			
	        // Ordena e lista os alunos
			objAluno.OrdenarListarAluno();
			
			String nomeAlunoFiltro = request.getParameter("nomeAlunoFiltro");

	        // Filtra os alunos pelo nome, se houver um nome de filtro
			if(nomeAlunoFiltro!="") {
				 objAluno.FiltrarAlunoPorNome(nomeAlunoFiltro);
			}
		
		saidaHtml.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"pt-br\" xml:lang=\"pt-br\">");
		saidaHtml.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'/>");
		saidaHtml.println("<body>");
		saidaHtml.println("Lista de alunos <br>");
		saidaHtml.println("<table>");
		saidaHtml.println("<tr>");
		saidaHtml.println("<td>");
		saidaHtml.println("<div>");
		saidaHtml.println("<b>Inserir Alunos</b>");
		saidaHtml.println("<form action=’listaalunos’>");
		saidaHtml.println("Nome do aluno: <input type='text' name='nomeAluno'><br>");
		saidaHtml.println("Registro do aluno: <input type='text' name='registr'><br>");
		saidaHtml.println("Nome do Curso: <input type='text' name='nomeCurso'><br>");
		saidaHtml.println("<input type='submit' value='Adicionar'>");
		saidaHtml.println("</form>");
		saidaHtml.println("</div>");
		saidaHtml.println("</td>");
		saidaHtml.println("<td>");
		saidaHtml.println("<div> <br>");
		saidaHtml.println("<b>Filtrar Alunos</b>");
		saidaHtml.println("<form action='listaalunos'>");
		saidaHtml.println("Digite parte do nome aluno: <input type='text' name='nomeAlunoFiltro'><br>");
		saidaHtml.println("<input type='submit' value='Filtrar'>");
		saidaHtml.println("</form>");
		saidaHtml.println("</div>");
		saidaHtml.println("</td>");
		saidaHtml.println("<tr>");
		saidaHtml.println("</table>");
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
		saidaHtml.println("<table>");
		for(AlunoModel aluno: objAluno.listaAlunoOrdenada) {
			saidaHtml.println("<tr>");
			saidaHtml.println("<td>" + aluno.Nome + "</td>");
			saidaHtml.println("<td>" + aluno.Registro + "</td>");
			saidaHtml.println("<td>" + aluno.NomeCurso + "</td>");
			saidaHtml.println("</tr>");
		}
		saidaHtml.println("</table>");
		saidaHtml.println("<b>Filtro por Nome</b>");
		saidaHtml.println("<table>");
		if(nomeAlunoFiltro!="") {
			listaAlunoFiltro = objAluno.FiltrarAlunoPorNome(nomeAlunoFiltro);
			for(AlunoModel aluno: listaAlunoFiltro) {
				 saidaHtml.println("<tr>");
				 saidaHtml.println("<td>" + aluno.Nome + "</td>");
				 saidaHtml.println("<td>" + aluno.Registro + "</td>");
				 saidaHtml.println("<td>" + aluno.NomeCurso + "</td>");
				 saidaHtml.println("</tr>");
			}
		}
		saidaHtml.println("</table>");
		saidaHtml.println("</body>");
		saidaHtml.println("</html>");
	}
}	
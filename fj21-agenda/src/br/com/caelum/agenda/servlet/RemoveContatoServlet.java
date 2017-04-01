package br.com.caelum.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

@WebServlet("/removeContato")
public class RemoveContatoServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		Long id = Long.parseLong(req.getParameter("id"));
		
		Contato c = new Contato();
		c.setId(id);
		
		Connection connection = (Connection) req.getAttribute("conexao");
		ContatoDao dao = new ContatoDao(connection);
		dao.exclui(c);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Contato " + c.getId() + " removido com Sucesso");
		out.println("</body>");
		out.println("</html>");
		
		
	}
}

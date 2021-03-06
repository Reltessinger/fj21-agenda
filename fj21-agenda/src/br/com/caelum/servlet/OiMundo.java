package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oi")
public class OiMundo extends HttpServlet {
	private int contador = 0;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Iniciando a servlet");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destruindo a servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		contador++;
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Contador agora é: " + contador);
		out.println("</body>");
		out.println("</html>");
	}

}

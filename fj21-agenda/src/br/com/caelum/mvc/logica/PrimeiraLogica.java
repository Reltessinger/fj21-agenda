package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		System.out.println("Executando a lógica ...");
		
		System.out.println("Retornando a Página JSP ...");
		return "primeira-logica.jsp";
	}
	
}

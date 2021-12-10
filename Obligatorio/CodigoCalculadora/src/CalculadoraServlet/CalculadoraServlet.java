package CalculadoraServlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CalculadoraService.CalculadoraService;


public class CalculadoraServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double n1=Double.parseDouble(request.getParameter("Numero 1"));
		Double n2=Double.parseDouble(request.getParameter("Numero 2"));
		String operador=request.getParameter("operador");
		Double resultado=0.0;
		CalculadoraService service =new CalculadoraService();
		resultado=service.Suma(n1, n2);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> CALCULADORA </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>CALCULADORA</h1>");
		out.println("<p>Numero 1: "+ n1 +"</p>");
		out.println("<p>Numero 1: "+ n2 +"</p>");
		out.println("<p>Resultado : "+ resultado +"</p>");
		out.println("<p><a href='index.html'> Nueva Operacion</a></p>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		
		
	}

}
package com.example.javadb.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		return super.getServletConfig();
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//imposta il tipo di response
	    response.setContentType("text/html");

	    String appName = getServletConfig().getInitParameter("app-name");
	    String developerName = getServletConfig().getInitParameter("app-author");

	    PrintWriter out = response.getWriter();

	    //inizio prologo obbligatorio
	    out.println("<!DOCTYPE html>");
	    out.println("<html lang=\"en\">");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
	    out.println(String.format("<title>%s</title>", appName));
	    out.println("</head>");
	    out.println("<body>");
	    //fine prologo obbligatorio

	    out.println("<div style=\"background-color: #034f84; padding: 10px; text-align: center;\">");
	    out.println(String.format("<h1><font color=\"#92a8d1\" style=\"font-family: Arial;\">Welcome from %s</h1>", appName));
	    out.println(String.format("<h2><font color=\"#92a8d1\" style=\"font-family: Arial;\"> by \"%s\"</h2>", developerName));
	    out.println(String.format("<h3><font color=\"#92a8d1\" style=\"font-family: Arial;\"> testing vscode too</h3>"));
	    out.println("</div>");

	    out.println(String.format("<p>Served at: %s</p>", request.getContextPath()));
	     
	    //inizio prologo obbligatorio
	    out.println("</body>");
	    out.println("</html>");
	    //fine prologo obbligatorio

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

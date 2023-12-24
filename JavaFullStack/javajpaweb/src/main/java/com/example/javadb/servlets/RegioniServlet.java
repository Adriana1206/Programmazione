package com.example.javadb.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.example.javadb.dao.RegioneJpaDAO;
import com.example.javadb.entities.Regione;

/**
 * Servlet implementation class RegioniServlet
 */
public class RegioniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegioniServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegioneJpaDAO rJpaDao = new RegioneJpaDAO();
		List<Regione> regioni = rJpaDao.findAll();
		
		//passare il model "regioni" alla regioni.jsp (view)
		request.setAttribute("elenco-regioni",regioni);
		
		//attivare la regioni.jsp (view) perché completi la response
		RequestDispatcher rd = request.getRequestDispatcher("regioni.jsp");
		
		rd.forward(request, response);
		
	}

}

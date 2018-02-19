package com.basico;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Suma
 */
@WebServlet("/Suma")
public class Suma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Suma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String equipo = request.getParameter("equipo");
		int usabilidad= Integer.parseInt(request.getParameter("usabilidad"));
		int presentacion = Integer.parseInt(request.getParameter("presentacion"));
		int visual = Integer.parseInt(request.getParameter("visual"));
		int sencillez=Integer.parseInt(request.getParameter("sencillez"));
		int facilidad = Integer.parseInt(request.getParameter("facilidad"));
		int utilidad = Integer.parseInt(request.getParameter("utilidad"));
		int seguridad = Integer.parseInt(request.getParameter("seguridad"));
		int recursos = Integer.parseInt(request.getParameter("recursos"));
		int objetivos = Integer.parseInt(request.getParameter("objetivos"));
		int creatividad = Integer.parseInt(request.getParameter("creatividad"));
		int problemas = Integer.parseInt(request.getParameter("problemas"));
		
		int suma = usabilidad + presentacion + visual + sencillez + facilidad + utilidad + seguridad + recursos + objetivos + creatividad + problemas;
		HttpSession sesion= request.getSession();
		sesion.setAttribute("votacion", new SumaPojo(equipo, suma));
		request.getRequestDispatcher("/conteo.jsp").forward(request, response);
		
	}

}

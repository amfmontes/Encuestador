package com.basico;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/encuesta", "root", "");
			
			PreparedStatement ps= conn.prepareStatement("INSERT INTO votaciones(equipo,suma) VALUES (?,?)");
			ps.setString(1, equipo);
			ps.setInt(2, suma);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<SumaPojo> listaVotaciones = new ArrayList<SumaPojo>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/encuesta", "root", "");

			// //CONSULTAR UN REGISTRO
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM votaciones ");
						
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SumaPojo tabla = new SumaPojo();
				tabla.setIdVotacion(rs.getInt("idVotacion"));
				tabla.setEquipo(rs.getString("equipo"));
				tabla.setSuma(rs.getInt("suma"));
				
				listaVotaciones.add(tabla);
			}

			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// request.getSession();
		request.setAttribute("listaVotaciones", listaVotaciones);

		request.getRequestDispatcher("/conteo.jsp").forward(request, response);
		
	}

}

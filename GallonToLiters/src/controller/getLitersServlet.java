package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GallonConversion;

/**
 * Servlet implementation class getLitersServlet
 */
@WebServlet("/getLitersServlet")
public class getLitersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getLitersServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userGallons = request.getParameter("gallons");
		
		GallonConversion gallonToLiters = new GallonConversion(Integer.parseInt(userGallons));
		
		request.setAttribute("toLiters", gallonToLiters);
		
		getServletContext().getRequestDispatcher("/result_liters.jsp").forward(request, response);
	}

}

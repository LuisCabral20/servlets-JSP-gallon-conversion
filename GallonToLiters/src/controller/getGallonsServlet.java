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
 * Servlet implementation class getGallonsServlet
 */
@WebServlet("/getGallonsServlet")
public class getGallonsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getGallonsServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userLiters = request.getParameter("liters");
				
		GallonConversion litersToGallons = new GallonConversion(Double.parseDouble(userLiters));
		
		request.setAttribute("toGallons", litersToGallons);
		
		getServletContext().getRequestDispatcher("/result_gallons.jsp").forward(request, response);
	}

}

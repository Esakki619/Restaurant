package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Restaurant_Imp;
import dao.restaurantdao;
import model.User;

/**
 * Servlet implementation class listalluser
 */
@WebServlet("/listalluser")
public class listalluser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listalluser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out =	response.getWriter();
		restaurantdao dao = new Restaurant_Imp();
		List<User> userlist = new ArrayList<>();
		userlist = dao.getAllUser();
		
		out.println("<html> <head> </head> <body>");
		out.println("<table  class=\"table table-striped\"> ");
		for( User temp : userlist) {
		out.println("<tr> <td> "+ temp.getUserID() +" </td>   <td> "+temp.getUserName()+" </td>   <td> "+temp.getPassword()+" </td>  </tr>");
		}
		out.println("</table> </body> </html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Expression
 */
@WebServlet("/Expression")
public class Expression extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String message;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Expression() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		message="";
		
		User u=new User();
		u.setName("Nisha");
		u.setEmail("nisha@gmail.com");
		u.setId(1);		
		u.setA(new Address("Bedford Pl","Marlboro",7751));
		//HttpSession session = request.getSession();
		request.getSession().setAttribute("user", u);
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
	}

}

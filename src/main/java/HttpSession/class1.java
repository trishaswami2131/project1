package HttpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/class1")
public class class1 extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String un=req.getParameter("username");
		String pwd=req.getParameter("password");
		System.out.println(un+" "+pwd);
		
		HttpSession session=req.getSession();
		session.setAttribute("trisha", un);
		session.setAttribute("pass123", pwd);
		
	}
}

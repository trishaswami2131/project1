package HttpSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/file1")
public class file1 extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String file1s1=req.getParameter("username");
		String file1s2=req.getParameter("password");
		
		System.out.println(file1s1+"  "+file1s2);
//		RequestDispatcher rd=req.getRequestDispatcher("xyz");
//      	rd.forward(req, resp);
		
		resp.sendRedirect("xyz");
//	}
}
}
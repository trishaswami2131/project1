package HttpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/class2")
public class class2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
//		String un= req.getSession().getAttribute("username");
//		String	 pwd= req.getSession().getAttribute("password");
		
		String s1= (String) req.getSession().getAttribute("username");
		String	 s2= (String) req.getSession().getAttribute("password");
		
		System.out.println(s1+" "+s2);
		
//		HttpSession session=req.getSession();
//		resp.sendRedirect("file2");
	}
}

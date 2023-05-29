package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/c1")
public class Classc1 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String un=req.getParameter("username");
		String pwd=req.getParameter("password");
		
		Cookie cookie1=new Cookie("uname",un);
		Cookie cookie2=new Cookie("password",pwd);
		System.out.println(un+" "+pwd);
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
	}
}

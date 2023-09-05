package test;

import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")

@WebServlet("/addition")
public class Addition extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		try {
			int x=Integer.parseInt(req.getParameter("v1"));
			int y=Integer.parseInt(req.getParameter("v2"));
			int z=x+y;
			
			pw.println("Sum of "+x+" and "+y+" is: "+z+"<br>");
		}catch(Exception e) {
			pw.println("Enter Integer value");
		}
		RequestDispatcher rd=req.getRequestDispatcher("NewFile.html");
		rd.include(req, res);
	}

}

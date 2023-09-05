package test;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@SuppressWarnings("serial")

@WebServlet("/Mod")
public class Mod extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)
	    throws IOException ,ServletException {
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		
		try {
		    int x=Integer.parseInt(req.getParameter("v1"));
		    int y=Integer.parseInt(req.getParameter("v2"));
		    int z=x%y;
		
		    pw.println("Mod of "+x+" with "+y+" is: "+z+"<br>");
		}catch(Exception e) {
			pw.println("Enter Integer values");
		}
		RequestDispatcher rd=req.getRequestDispatcher("NewFile.html");
		rd.include(req, res);
	}

}

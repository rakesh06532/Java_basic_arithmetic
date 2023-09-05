package test;

import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")

@WebServlet("/calculation")
public class ChoiceServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		String s1=req.getParameter("s1");
		
		if(s1.equals("Addition")) {
		RequestDispatcher rd=req.getRequestDispatcher("addition");
		rd.forward(req, res);
		}
		else if(s1.equals("Subtraction")) {
			RequestDispatcher rd=req.getRequestDispatcher("subtract");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("Mod");
			rd.forward(req, res);
		}
		
	}

}

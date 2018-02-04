import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
	       
	    String username = request.getParameter("username");  
	    String password = request.getParameter("password");  
	  
	    PrintWriter out = response.getWriter();   
	    response.setContentType("text/html");  
	    
	    if(username.equals("admin") && password.equals("admin")){
	    	this.writeMessage(out, "You successfully logged !");
	    }else{  
	    	this.writeMessage(out, "Error occurred, wrong credentials !");
	    }   
	    
	    out.close();  
	}  
	
	
	private void writeMessage(PrintWriter out, String message){
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Answer</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(message);
		out.println("</body>");
		out.println("</html>");
	}	
}  	


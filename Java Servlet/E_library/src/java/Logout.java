import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*;
public class Logout extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{ Cookie ck=new Cookie("un","");
        ck.setMaxAge(0);
        response.addCookie(ck);
        response.sendRedirect("first.html");
        }
        
}
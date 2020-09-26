import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*;
public class Register extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		out.println("<html>");
		out.println("<body>");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			Statement st=con.createStatement();
			String q="insert into login values('"+s1+"','"+s2+"')";
			st.executeUpdate(q);
			response.sendRedirect("login.html");
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
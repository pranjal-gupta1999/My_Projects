import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*;
public class Delete extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("un");
		out.println("<html>");
		out.println("<body>");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			Statement st=con.createStatement();
			String q="delete from login where uname='"+s1+"'";
			st.executeUpdate(q);
                        response.sendRedirect("afteradmin.html");
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
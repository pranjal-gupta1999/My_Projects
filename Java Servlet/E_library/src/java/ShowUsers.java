import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ShowUsers extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<head><link rel='stylesheet' type='text/css' href='xyz.css'</head>");
	out.println("<body>");
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st=con.createStatement();
		String q="select* from login";
		ResultSet rs=st.executeQuery(q);
		out.println("<center>");
		out.println("<table cellpadding='12'>");
		out.println("<th>UNAME</th>");
                out.println("<th>UPASS</th>");
                while(rs.next())
		{
			
			out.println("<tr>");
			out.println("<td>"+rs.getString(1)+"</td>");
			out.println("<td>"+rs.getString(2)+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</center>");
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
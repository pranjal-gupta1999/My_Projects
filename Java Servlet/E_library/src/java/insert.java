import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*;
public class insert extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
                 Cookie[] ck=request.getCookies();
		String s1=request.getParameter("un3");
		java.util.Date date= new java.util.Date();
                //String s2=request.getParameter("up");
		out.println("<html>");
		out.println("<body>");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			Statement st=con.createStatement();
			String q="insert into info values('"+ck[0].getValue()+"','"+s1+"','"+date +"')";
			st.executeUpdate(q);
                       
                        out.print("<link rel='stylesheet' type='text/css' href='123.css'>");
                       
                        out.print("<div id='mymenu'>");
                        out.print("<ul>");
                        out.print("<li><a href='Logout' style=text-decoration:none>Logout</a></li>\n" +
"</ul>\n" +
"</div>");
out.print("<form><center>");
out.print("<caption><font size='4' color='white'>VOILA!!</font></caption>");
out.print("<table  cellpadding='20px'>");
out.print("<tr><th colspan='2'>YAY, &nbsp PDF IS DOWNLOADING..</th></tr>");
out.print("<tr><td>If Downloading doesn't starts..</td>");
out.print("<td><a href='file:///C:/Users/Pranjal/Desktop/"+s1+" '><input type='Button' value='Click here'></a></td></tr>");
out.print("</table>");
out.print("</center>");
out.print("</form>");
	//response.sendRedirect("login.html");
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
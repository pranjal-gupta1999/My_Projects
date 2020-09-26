import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*;
public class login extends HttpServlet
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
			String q="select * from login where uname='"+s1+"'and upass='"+s2+"'";
			ResultSet rs=st.executeQuery(q);
                        if(rs.next())
                        {
                           Cookie ck=new Cookie("un",s1);
                           ck.setMaxAge(60*2);
                           response.addCookie(ck);
                           response.sendRedirect("Cookierecieve"); 
                        }
                        else{  
                           response.sendRedirect("Cookierecieve");
                        }
			
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
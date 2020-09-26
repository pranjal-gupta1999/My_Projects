import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Cookierecieve extends HttpServlet
{
    public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
        Cookie[] ck=request.getCookies();
        if(ck!=null)
        {
            out.print("<html>");
            out.print("<head>");
            out.print("<link rel='stylesheet' type='text/css' href=123.css>");
            out.print("</head>");
            out.print("<body>");
            out.print("<div id='note'>");
            out.print("WELCOME &nbsp"+ck[0].getValue()); 
            out.print("</div>");
            out.print("<p><font color='white',font size='5'>YOU ARE NOW A REGISTERED MEMBER!!</font></p>");
            out.print("<form>");
            out.print("<center>");
            out.print("<caption><font size='4' color='white'>SELECT YOUR BRANCH</font></caption>");
            out.print("<table  cellpadding='20px'>");
            out.print("<tr><td><a href='cse.html'><input type='Button' value='Computer Science&Engineering' id='t1' class='B'></a></td> ");
            out.print("<td><a href='mech.html'><input type='Button' value='Mechanical Engineering' id='t1' class='B'></a></td> ");
            out.print("<td><a href='chemical.html'><input type='Button' value='Chemical Engineering' id='t1' class='B'></a></td></tr>");
            out.print("<tr><td><a href='elect.html'><input type='Button' value='Electrical Engineering' id='t1' class='B'></a></td> ");
            out.print("<td><a href='civil.html'><input type='Button' value='Civil Engineering' id='t1' class='B'></a></td> ");
            out.print("<td><a href='aero.html '><input type='Button' value='Aeronautical Engineering' id='t1' class='B'></a></td></tr> ");
            out.print("</center>");
            out.print("</form>");
            out.print("</body>");
            out.print("</html>");
           
        }
        else{
          out.println("<html>");
          out.println("<head><link rel='stylesheet' type='text/css' href='xyz.css'></head>");
          out.println("<body>");
          out.println("<form action='Register'>");
          out.println("<center>");
          out.println("<caption><font color='white'>ENTER YOUR DETAILS</font></caption>");
          out.println("<table  cellpadding='20px'>");
          out.println("<tr><td>ENTER YOUR NAME</td>");
          out.println("<td><input type='text' name='un' id='t1' placeholder='Enter name'></td></tr>");
          out.print("<tr><td>ENTER PASSWORD</td>");
          out.print("<td><input type='password' name='up' id='t2' placeholder='Enter pass'></td></tr>");
          out.print("<tr><th colspan='1'><input type='submit' class='B' value='Login'></th>");
          out.print("<th><input type='reset' class='B'></th></tr>");
out.print("<tr><td>Don't have an Account?</td><td><a href='Register.html'><input type='Button' value='Click here!!'></a></td></tr>");
out.print("<tr><th colspan='2'>Invalid UserName or Password</th></tr>");
          out.print("</table>");
          out.print("</center>");
          out.print("</form>");
          out.print("</body>");
          out.print("</html>");
        }
    }
}

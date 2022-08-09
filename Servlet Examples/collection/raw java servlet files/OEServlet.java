import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class OEServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int val = Integer.parseInt(request.getParameter("val1"));        
        out.println("<html>");
        out.println("<head><title>Odd or Even</title></head>");
        out.println("<body>");
        if(val%2==0){
            out.println(val+" is Even.");
        }else if(val%2!=0){
            out.println(val+" is Odd.");
        }else{
            out.println(val+" is not an Integer");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
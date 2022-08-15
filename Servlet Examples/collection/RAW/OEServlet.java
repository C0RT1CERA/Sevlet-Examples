import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class OEServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int val = Integer.parseInt(request.getParameter("val1"));        
        out.println("<html>");
        out.println("<head><title>Odd/Even</title></head>");
        out.println("<body style=\"background-color: #160040;\">");
        out.println("<div style='margin-top: 150px; font-size:30px; border: 5px solid #8E05C2; text-align: center; color: #F1EFDC;'>");
        out.println("<p>Odd/Even</p>");
        out.println("</div>");    
        out.println("<div style='font-size:20px; border: 5px solid #8E05C2; text-align: center; color: #F1EFDC;'>");
        out.println("<p>");
        if(val%2==0){
            out.println(val+" is Even.");
        }else if(val%2!=0){
            out.println(val+" is Odd.");
        }else{
            out.println(val+" is not an Integer");
        }
        out.println("</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class SignServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int val = Integer.parseInt(request.getParameter("val1"));
        out.println("<html>");
        out.println("<head><title>Sign Detector</title></head>");
        out.println("<body>");
        if(val==0){
            out.println(val+" is Zero.");
        }else if(val<0){
            out.println(val+" is a Negative integer");
        }else if(val>0){
            out.println(val+" is a Positive integer");
        }else{
            out.println(val+" is not an Integer");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
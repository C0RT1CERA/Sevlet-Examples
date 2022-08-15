import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class FactServlet extends HttpServlet{
    public int fact(int n){
        if(n>=1){
            return n*fact(n-1);
        }else{
            return 1;
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int val = Integer.parseInt(request.getParameter("val1"));
        out.println("<html>");
        out.println("<head><title>Factorial</title></head>");
        out.println("<body style=\"background-color: #160040;\">");
        out.println("<div style='margin-top: 150px; font-size:30px; border: 5px solid #8E05C2; text-align: center; color: #F1EFDC;'>");
        out.println("<p>Factorial</p>");
        out.println("</div>");    
        out.println("<div style='font-size:20px; border: 5px solid #8E05C2; text-align: center; color: #F1EFDC;'>");
        out.println("<p>");
        if(!(val<0)){
            out.println("Factorial of "+val+" is:"+fact(val));
        }else{
            out.println(val+" is an Invalid Entry.");
        }
        out.println("</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
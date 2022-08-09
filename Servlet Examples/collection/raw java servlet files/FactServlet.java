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
        out.println("<head><title>Factorial!</title></head>");
        out.println("<body>");
        if(!(val<0)){
            out.println("Factorial of "+val+" is:"+fact(val));
        }else{
            out.println(val+" is an Invalid Entry.");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class CalcServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String op = request.getParameter("op");
        int val1 = Integer.parseInt(request.getParameter("val1"));
        int val2 = Integer.parseInt(request.getParameter("val2"));
        out.println("<html>");
        out.println("<head><title>Calculator</title></head>");
        out.println("<body>");
        if(op.equals("+")){
            out.println(val1+" "+op+""+val2+"="+(val1+val2));
        }else if(op.equals("-")){
            out.println(val1+" "+op+""+val2+"="+(val1-val2));
        }else if(op.equals("/")){
            out.println(val1+" "+op+""+val2+"="+(val1/val2));
        }else if(op.equals("x")){
            out.println(val1+" "+op+""+val2+"="+(val1*val2));
        }else{
            out.println(op+" is an Invalid operator!");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
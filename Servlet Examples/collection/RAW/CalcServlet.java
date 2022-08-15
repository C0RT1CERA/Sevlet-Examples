import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class CalcServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String op = request.getParameter("op");
        float val1 = Integer.parseInt(request.getParameter("val1"));
        float val2 = Integer.parseInt(request.getParameter("val2"));
        out.println("<html>");
        out.println("<head><title>Calculator</title></head>");
        out.println("<body style=\"background-color: #160040;\">");
        out.println("<div style='margin-top: 150px; font-size:30px; border: 5px solid #8E05C2; text-align: center; color: #F1EFDC;'>");
        out.println("<p>CALCULATOR</p>");
        out.println("</div>");
        
        out.println("<div style='font-size:20px; border: 5px solid #8E05C2; text-align: center; color: #F1EFDC;'>");
        out.println("<p>");

        if(op.equals("+")){
            out.println(val1+" + "+val2+" = "+(val1+val2));
        }else if(op.equals("-")){
            out.println(val1+" - "+val2+" = "+(val1-val2));
        }else if(op.equals("/")){
            out.println(val1+" / "+val2+" = "+(val1/val2));
        }else if(op.equals("x")){
            out.println(val1+" x "+val2+" = "+(val1*val2));
        }else{
            out.println("Invalid operator!");
        }

        out.println("</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
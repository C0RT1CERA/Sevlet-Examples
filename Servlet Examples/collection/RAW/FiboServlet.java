import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class FiboServlet extends HttpServlet{
    public int fibo(int n){
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }
        return fibo(n-2) + fibo(n-1);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int val = Integer.parseInt(request.getParameter("val1"));
        int a[]=new int[val];
        for(int i=0;i<val;i++){
            a[i]=fibo(i);
        }
        out.println("<html>");
        out.println("<head><title>Fibonacci</title></head>");
        out.println("<body style=\"background-color: #160040;\">");
        out.println("<div style='margin-top: 150px; font-size:30px; border: 5px solid #8E05C2; text-align: center; color: #F1EFDC;'>");
        out.println("<p>Fibonacci Series</p>");
        out.println("</div>");    
        out.println("<div style='font-size:20px; border: 5px solid #8E05C2; text-align: center; color: #F1EFDC;'>");
        out.println("<p>");
        if(!(val<0)){
            out.println("First "+val+" numbers of fibonacci sequence are:");
            for(int i=0;i<val;i++){
                out.print(","+a[i]);
            }
        }else{
            out.println(val+" is an Invalid Entry.");
        }
        out.println("</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
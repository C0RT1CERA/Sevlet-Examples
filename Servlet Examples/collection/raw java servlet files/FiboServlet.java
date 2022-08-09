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
        out.println("<body>");
        if(!(val<0)){
            out.println("First "+val+" numbers of fibonacci sequence are:");
            for(int i=0;i<val;i++){
                out.print(","+a[i]);
            }
        }else{
            out.println(val+" is an Invalid Entry.");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
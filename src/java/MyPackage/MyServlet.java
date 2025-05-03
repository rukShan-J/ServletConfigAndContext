
package MyPackage;

import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        out.println("Hello ");
        
        
        ServletContext ctx = getServletContext(); 
        
        //Get <context-param> -  <param-name> 
        String strN = ctx.getInitParameter("name");     
        String strP = ctx.getInitParameter("Phone");
        
        //Print <context-param> -  <param-value>
        out.println(strN);          
        out.println(strP);
        
    }

}

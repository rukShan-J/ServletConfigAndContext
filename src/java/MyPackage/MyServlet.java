
package MyPackage;

import jakarta.servlet.ServletConfig;
//import jakarta.servlet.ServletContext;
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
        
        //2
//        ServletContext ctx = getServletContext(); 
        
//        //3
//        //Get <context-param> -  <param-name> 
//        String strN = ctx.getInitParameter("name");     
//        String strP = ctx.getInitParameter("Phone");

        //5
        //if have different value for different servlet, good to go for servletConfig
        ServletConfig cg = getServletConfig();
        String str = cg.getInitParameter("name");   
        out.println(str);
        
        //4
        //Print <context-param> -  <param-value>
//        out.println(strN);          
//        out.println(strP);
        
    }

}

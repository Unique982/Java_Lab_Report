/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Implementing_Servlet_interface implements Servlet {

 
    private ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException{
         this.config = config;
    }
   
    @Override
   public void service(ServletRequest request,ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       out.println("<h1>This is First Way to create Servlet</h1>"); 
        }
  @Override
    public void destroy() {

    }
    @Override
    public ServletConfig getServletConfig(){
        return config;
    }
    @Override
    public String getServletInfo(){
        return "Servlet By Impementing ServletInterface";
    }
 
  
    }

    


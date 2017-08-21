/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aruns.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author admin
 */
public class LoginCheck extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        System.out.println("Welcome to servlet");
        String name=request.getParameter("uname");
        String pass=request.getParameter("upass");
        PrintWriter pw=response.getWriter();
        response.setContentType("text/html");
        if(name.equals("admin")&&pass.equals("password"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
            request.setAttribute("name", name);
            rd.forward(request, response);
        }
        else
        {
            pw.print("<p>Please Enter Correct User name and Password!</p>");
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request, response); 
        }
    }    
}

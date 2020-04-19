/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author cl4r4m0r41s
 */

@WebServlet(urlPatterns={"/nomeservlet"})
public class login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("vaipraonde?");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws IOException, ServletException{
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
        User pet = new User(email , senha);
        ServletContext context = getServletContext();
        
        if(pet.getEmail("pet@gmail.com") && pet.getSenha("pet")){
            HttpSession session = request.getSession();
            response.sendRedirect("vaipraonde?");  
     }
        else{ 
            RequestDispatcher dispatcher = request.getRequestDispatcher("log.jsp");
        }   dispatcher.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "PetShopWebProg3";
    }// </editor-fold>

}

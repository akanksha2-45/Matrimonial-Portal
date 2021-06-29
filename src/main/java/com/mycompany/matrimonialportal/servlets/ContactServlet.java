
package com.mycompany.matrimonialportal.servlets;

import com.mycompany.matrimonialportal.entities.Contact;
import com.mycompany.matrimonialportal.helper.FactoryProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class ContactServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             try{
                
                String userName = request.getParameter("name");
                String userEmail = request.getParameter("email");
                String userMessage = request.getParameter("Message");
               
                
                //validations
                
                if(userName.isEmpty()){
                out.println("Name is Blank");
                return;
                }
                
                //creating user object to store data
                
                Contact  user = new Contact(userName, userEmail, userMessage);
                 
                Session hibernetSession = FactoryProvider.getFactory().openSession();
                
                
                 Transaction tx =  hibernetSession.beginTransaction();
                 
                  int userId = (int)hibernetSession.save(user);
                
                  tx.commit();
                  
                hibernetSession.close();
                
                HttpSession httpSession = request.getSession();
                
                httpSession.setAttribute("message"," Successfully submitted!! "+userId);
                response.sendRedirect("contactcontents.jsp");
                return;
                
                
                
                
                
                
                
                
            }catch(Exception e){
                e.printStackTrace();
                
 
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

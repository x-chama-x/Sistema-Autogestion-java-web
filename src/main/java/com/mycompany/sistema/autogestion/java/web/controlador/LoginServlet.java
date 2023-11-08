/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.mycompany.sistema.autogestion.java.web.modelo.UsuarioDAO;

/**
 *
 * @author Manuel Botas
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        request.getRequestDispatcher(request.getContextPath()).forward(request, response);
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
        String mail = request.getParameter("mail");
        String contrasenia = request.getParameter("contrasenia");
        Usuario user = new UsuarioDAO().buscar(mail, contrasenia);
        if (user != null) {
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(60 * 60);
            session.setAttribute("userLogueado", user);
            /* Idea para no usar instanceof:
             * Usar una consulta en la base de datos para obtener la tabla a la que pertenece el usuario, lo que equivale al rol.
             * Se obtiene el resultado como un String y se guarda en una variable.
             * Se usa un switch para redirigir a la página correspondiente.
             * Se setea un atributo de la sesión con el rol del usuario.
             */
            if(user instanceof Alumno) {
                request.getRequestDispatcher("/jsp/jsp_alumno/MenuAlumno.jsp").forward(request, response);
            } else if(user instanceof Profesor) {
                request.getRequestDispatcher("/jsp/jsp_profesor/MenuProfesor.jsp").forward(request, response);
            } else if(user instanceof Admin) {
                request.getRequestDispatcher("/jsp/jsp_admin/MenuAdmin.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("hayError", true);
            request.setAttribute("mensajeError", "Credenciales incorrectas");
            doGet(request, response);
        }
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

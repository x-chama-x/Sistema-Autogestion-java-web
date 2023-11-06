/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 *
 * @author Manuel Botas
 */
public class AuthFilter implements Filter{

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) sr;
        HttpServletResponse httpResp = (HttpServletResponse) sr1;
        HttpSession session = httpReq.getSession();
        if(session != null && session.getAttribute("userLogueado") != null){
            fc.doFilter(sr, sr1);
        } else {
            httpReq.setAttribute("hayError", true);
            httpReq.setAttribute("mensajeError", "Debe iniciar sesión");
            httpResp.sendRedirect(httpReq.getContextPath());
        }
    }
    
}

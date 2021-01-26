package edu.lwtech.csd297.hello;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// World's Simplest Hello World Servlet -
//      http://server:8080/hello/servlet
//
// Chip Anderson
// LWTech CSD297

@WebServlet(name = "hello", urlPatterns = {"/servlet"}, loadOnStartup = 0)
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;        // Unused

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try (ServletOutputStream out = response.getOutputStream()) {
            out.println("<html><body><h1>Hello World!</h1></body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
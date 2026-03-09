
package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Jenkins CI/CD Demo</title></head>");
        out.println("<body>");
        out.println("<h1>Hello from Java Web Application 🚀</h1>");
        out.println("<p>Deployed using Jenkins CI/CD Pipeline</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

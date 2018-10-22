package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;

public class BrowserDetectorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userAgent = request.getHeader("User-Agent");

        PrintWriter writer = response.getWriter();
        String browser = "Unknow browser";
        if (userAgent.contains("Firefox")) {
            browser = "Mozilla Firefox";
        } else if (userAgent.contains("Safari")) {
            if (userAgent.contains("Chrome")) {
                browser = "Google Chrome";
            } else
                browser = "Apple Safari";
        }

        writer.println("<html>");
        writer.println("<h1>Browser Detector</h1>");
        writer.println("<h3>Your User-Agent Is: " + userAgent + "</h3>");
        writer.println("<h3>Your Browser Is: " + browser + "</h3>");
        writer.println("</html>");
    }
}

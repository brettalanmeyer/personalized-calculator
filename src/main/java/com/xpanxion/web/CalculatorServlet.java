package com.xpanxion.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("guest");

        PrintWriter writer = resp.getWriter();

        writer.write("<html>");

        writer.write("<head>");
        writer.write("<title>Personalized Calculator</title>");
        writer.write("</head>");

        writer.write("<body>");
        writer.write("<h1>Hi, " + name + "</h1>");
        writer.write("</body>");

        writer.write("</html>");

    }

}

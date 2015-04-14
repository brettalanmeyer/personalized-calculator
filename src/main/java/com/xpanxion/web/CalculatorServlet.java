package com.xpanxion.web;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xpanxion.Calculation;
import com.xpanxion.Calculator;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String guestName = req.getParameter("guest");
        session.setAttribute("guest", guestName);

        req.getRequestDispatcher("calculator.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String guestName = (String) session.getAttribute("guest");

        String operands = req.getParameter("operands");
        Scanner scanner = new Scanner(operands);

        Calculator calculator = new Calculator();
        Calculation results = calculator.performAction(Calculator.ADDITION, guestName, scanner);

        req.setAttribute("resultText", results.getTextResult());

        req.getRequestDispatcher("calculator.jsp").forward(req, resp);

    }

}

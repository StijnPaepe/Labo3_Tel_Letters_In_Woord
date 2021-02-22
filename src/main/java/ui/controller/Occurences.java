package ui.controller;

import domain.model.LetterCounter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Occurences")
public class Occurences extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        char letter = request.getParameter("letter").charAt(0);
        String woord = request.getParameter("woord");

        int aantalLetters = LetterCounter.countLetters(woord,letter);

        request.setAttribute("aantalKeer", aantalLetters);

        request.getRequestDispatcher("result.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

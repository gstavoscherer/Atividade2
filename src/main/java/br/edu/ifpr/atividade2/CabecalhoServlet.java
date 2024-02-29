package br.edu.ifpr.atividade2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.script.ScriptContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringBufferInputStream;

@WebServlet("/cabecalhos")
public class CabecalhoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String host = req.getHeader("host");
        String user = req.getHeader("user-agent");
        String acceptencoding = req.getHeader("accept-encoding");
        String acceptlanguage = req.getHeader("accept-language");
        writer.println("<html> ");
        writer.println("<p>" + host + "</p>");
        writer.println("<p>" + user + "</p>");
        writer.println("<p>" + acceptencoding + "</p>");
        writer.println("<p>" + acceptlanguage + "</p>");
    }
}

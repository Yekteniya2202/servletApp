package com.company.servlet;

import com.company.service.ClientServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/client")
public class ClientServlet extends HttpServlet {
    private static ClientServiceImpl cs = new ClientServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        //resp.getWriter().write("hi");

        String id_str = req.getParameter("id");
        ClientResponse response = new ClientResponse();
        Gson gson = new Gson();
        response.client = cs.read(Integer.parseInt(id_str));
        response.statusCode = 200;
        response.description = "OK";
        resp.getWriter().write(gson.toJson(response));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
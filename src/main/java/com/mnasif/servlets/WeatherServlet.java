package com.mnasif.servlets;

import com.mnasif.dao.ApplicationDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WeatherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //collect search string from the form
        String city = request.getParameter("city");

        //call DAO layer and get all products for search criteria
        ApplicationDao dao = new ApplicationDao();




        //write the products data back to the client browser



    }


}

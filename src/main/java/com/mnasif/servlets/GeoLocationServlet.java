package com.mnasif.servlets;

import com.mnasif.beans.Location;
import com.mnasif.dao.ApplicationDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GeoLocationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //collect search string from the form

        String searchString = request.getParameter("zipcode");

        //call DAO layer and get all products for search criteria

        ApplicationDao dao = new ApplicationDao();
        List<Location> locations = dao.searchLocation(searchString);

        // write the data back to the client browser


    }


}

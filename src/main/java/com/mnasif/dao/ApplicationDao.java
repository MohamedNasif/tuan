package com.mnasif.dao;

import com.mnasif.beans.Location;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ApplicationDao {

 //  access to the location database

    public List<Location> searchLocation(String searchString) {

        Location location = null;

        List<Location> locations = new ArrayList<>();

       try {
           Connection connection = DBConnection.getConnectionToLocationDatabase();

           String sql = "Select * from location_table where city like '%"+searchString+"%'";

           Statement statement = connection.createStatement();

           statement.executeQuery(sql);

           ResultSet set = statement.executeQuery(sql);

           while(set.next()) {
               location = new Location();
               location.setId(set.getInt("id"));
               location.setCity(set.getString("city"));
               location.setZipCode(set.getInt("zipcode"));
               location.setCountyName(set.getString("countyname"));
               location.setTimeZone(set.getString("timezone"));
               location.setStatus(set.getString("status"));

               locations.add(location);



           }
       }catch (SQLException exception){
           exception.printStackTrace();
       }
        return  locations;
    }

 // access to the weather database





}

package com.mnasif.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnectionToLocationDatabase() {
        Connection connection = null;

        try {

            // load the driver class
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("MySQL JDBC Driver of location Registered!");

            // get hold of the DriverManager
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/location", "root", "HelloWorldx87!");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver of location?");
            e.printStackTrace();

        }

        catch (SQLException e) {
            System.out.println("Connection to location Failed! Check output console");
            e.printStackTrace();

        }

        if (connection != null) {
            System.out.println("Connection made to location DB!");
        }
        return connection;
    }



    public static Connection getConnectionToWeatherDatabase() {
        Connection connection = null;

        try {

            // load the driver class
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("MySQL JDBC Driver Registered!");

            // get hold of the DriverManager
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weather", "root", "HelloWorldx87!");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();

        }

        catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }

        if (connection != null) {
            System.out.println("Connection made to DB!");
        }
        return connection;
    }




}

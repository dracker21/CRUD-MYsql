/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jorge Sanchez Hernandez
 */
public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/prueba";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "pass123";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return connection;
    }
    
}

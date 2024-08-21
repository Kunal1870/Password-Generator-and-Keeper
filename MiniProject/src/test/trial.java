/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Sagar Arora
 */
public class trial {
    


    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/trial";
        String username = "root";
        String password = "Nhidalna@123";
        String name = "sagar";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String qry = "INSERT INTO `trial`.`test`(name)VALUES('"+name+"')";
            statement.executeUpdate(qry);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}




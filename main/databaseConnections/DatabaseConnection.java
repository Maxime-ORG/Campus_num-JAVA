package main.databaseConnections;

import java.sql.*;

public class DatabaseConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/dd_db?verifyServerCertificate=false&useSSL=true";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT * FROM equipment";

    public static void main(String[] args) {
        selectAllAndSoutFromEquipement();

    }

    static void selectAllAndSoutFromEquipement(){
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("idequipment"));
                System.out.print(", Name: " + rs.getString("name"));
                System.out.print(", Power: " + rs.getInt("power"));
                System.out.println(", Type: " + rs.getString("type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void selectAllAndSoutFromClass(){
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("idequipment"));
                System.out.print(", Name: " + rs.getString("name"));
                System.out.print(", Power: " + rs.getInt("power"));
                System.out.println(", Type: " + rs.getString("type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

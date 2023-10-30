package main.databaseConnections;

import java.sql.*;

public class DatabaseConnections {
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?verifyServerCertificate=false&useSSL=true";
    static final String USER = "root";
    static final String PASS = "root";
    static private Connection conn;

    public static void main(String[] args) throws SQLException {
        setConn(DriverManager.getConnection(DB_URL, USER, PASS));
        selectAllAndSoutFromEquipement();
        insertIntoCharacters("popol", "magicien");
    }

    static void selectAllAndSoutFromEquipement() throws SQLException {
        Statement stmt = getConn().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM equipment");
        while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("idequipment"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Power: " + rs.getInt("power"));
            System.out.println(", Type: " + rs.getString("type"));
        }
    }

    static void insertIntoCharacters(String name, String type) throws SQLException {

            Statement stmt = getConn().createStatement();
            stmt.executeUpdate("INSERT INTO characters (`attack`, `current_life`, `fk_class`, `fk_defensive`, `fk_offensive`, `max_life`, `name`) \n" +
                    "VALUES ((SELECT attack FROM class WHERE (`name` = \""+type+"\")), " +
                    "        (SELECT currentLife FROM class WHERE (`name` = \""+type+"\")), \n" +
                    "        (SELECT idclass FROM class WHERE (`name` = \""+type+"\")), \n" +
                    "        (SELECT idequipment FROM equipment WHERE (`type` = \"epee\")), \n" +
                    "        (SELECT idequipment FROM equipment WHERE (`type` = \"bouclier en cuir\")), \n" +
                    "        (SELECT maxLife FROM class WHERE (`name` = \""+type+"\")), \n" +
                    "        \""+name+"\");\n");
            // Extract data from result set
    }




    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        DatabaseConnections.conn = conn;
    }
    }
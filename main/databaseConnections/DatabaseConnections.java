package main.databaseConnections;

import java.sql.*;
import main.characters.Characters;
import main.characters.Guerriers;
import main.stage.Stage;

public class  DatabaseConnections {
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?verifyServerCertificate=false&useSSL=true";
    static final String USER = "root";
    static final String PASS = "roo";
    static private Connection conn;

    public static void main(String[] args) throws SQLException {
        setConn(DriverManager.getConnection(DB_URL, USER, PASS));
//        insertIntoCharacters("pol", "guerrier");
//        selectAllAndSoutFromHeroes();

//        Characters myGuerrier = new Guerriers("popol");
//        myGuerrier.setCurrentLife(100);
//        changeLifePoint(myGuerrier);
    }

    public DatabaseConnections() throws SQLException {
        setConn(DriverManager.getConnection(DB_URL, USER, PASS));
    }

    public static void selectAllAndSoutFromEquipement() throws SQLException {
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

    public static void selectAllAndSoutFromHeroes() throws SQLException {
        Statement stmt = getConn().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT characters.idcharacters, characters.name, characters.attack, characters.current_life, class.name AS \"class_name\", offensive.name AS \"offensive_name\" , defensive.name AS \"defensive_name\" \n" +
                "FROM (((characters INNER JOIN class ON characters.fk_class = class.idclass) \n" +
                "JOIN equipment offensive ON characters.fk_offensive = offensive.idequipment)\n" +
                "JOIN equipment defensive ON characters.fk_defensive = defensive.idequipment);");
        while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("idcharacters"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Life: " + rs.getString("current_life"));
            System.out.print(", Attak: " + rs.getInt("attack"));
            System.out.print(", Type: " + rs.getString("class_name"));
            System.out.print(", Equipement offensif: " + rs.getString("offensive_name"));
            System.out.println(", Equipement defensif: " + rs.getString("defensive_name"));
        }
    }

    public static void changeLifePoint(Characters pCharacter) throws SQLException {
        String name = pCharacter.getName();
        int currentLife = pCharacter.getCurrentLife();
        Statement stmt = getConn().createStatement();
        stmt.executeUpdate("UPDATE characters \n" +
                "SET characters.current_life = "+currentLife+"\n" +
                "WHERE characters.name = \""+name+"\"");
    }

    public static void insertIntoCharacters(Characters pCharacter) throws SQLException {
        PreparedStatement ps = getConn().prepareStatement("INSERT INTO characters (`attack`, `current_life`, `fk_class`, `fk_defensive`, `fk_offensive`, `max_life`, `name`) " +
                "VALUES (?," +
                "?," +
                "(SELECT idclass FROM class WHERE (`name` = ?))," +
                "(SELECT idequipment FROM equipment WHERE (`type` = ?))," +
                "(SELECT idequipment FROM equipment WHERE (`type` = ?))," +
                "?," +
                "?)");
        ps.setInt(1, pCharacter.getAttack());
        ps.setInt(2, pCharacter.getCurrentLife());
        ps.setString(3, pCharacter.getClass().getSimpleName().toLowerCase());
        ps.setString(4, pCharacter.getDefensiveItem().getClass().getSimpleName().toLowerCase());
        ps.setString(5, pCharacter.getOffensiveItem().getClass().getSimpleName().toLowerCase());
        ps.setInt(6, pCharacter.getMaxLife());
        ps.setString(7, pCharacter.getName());
        ps.executeUpdate();
    }

    public static void setStage(Stage pStage) throws SQLException {

    }

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        DatabaseConnections.conn = conn;
    }
    }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Sander
 */
public class DatabaseMediator {

    // <editor-fold defaultstate="collapsed" desc="Fields">
    private Properties props;
    private Connection conn;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public DatabaseMediator(Properties props) throws IOException {
        this.props = props;
        try {
            initConnection();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            this.props = null;
        } finally {
            closeConnection();
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    public Character loadHero(int ID) {
        try {
            initConnection();
            PreparedStatement myStmt = conn.prepareStatement("SELECT * FROM `character` WHERE ?"); 
            myStmt.setInt(1, ID);             
            ResultSet rS = myStmt.executeQuery();
            
            while (rS.next()) {
                int id = rS.getInt("id");
                String naam = rS.getString("name");
                int health = rS.getInt("health");
                int defence = rS.getInt("defence");
                int attack = rS.getInt("attack");
                int currentHealth = rS.getInt("currentHealth");
                int currentTurns = rS.getInt("currentTurns");
                int experience = rS.getInt("experience");
                int expDrop = rS.getInt("expDrop");
                int goldDrop = rS.getInt("goldDrop");
                int charClass = rS.getInt("class");
                int gameID = rS.getInt("gameID");
                int userID = rS.getInt("userID");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            closeConnection();
            return null;
        }
    }

    private void initConnection() throws SQLException {
        String driver = props.getProperty("driver");
        if (driver != null) {
            System.setProperty("jdbc.drivers", driver);
        }
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");
        conn = DriverManager.getConnection(url, username, password);
    }

    private void closeConnection() {
        try {
            conn.close();
            conn = null;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    // </editor-fold>
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author 84384
 */
public class API {
    Connection cnn;
    public API() {
        cnn= new connection.connect2().getConnection();
    }
    
    public String checkUserAccount(String user, String pass){
        String query= new Query().checkUserAccount();
        try(PreparedStatement ps= cnn.prepareStatement(query)) {
            ps.setString(1, user.trim());
            ps.setString(2, pass.trim());
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {                
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

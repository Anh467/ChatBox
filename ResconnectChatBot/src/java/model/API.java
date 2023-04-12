/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import hash.Argon;
import java.sql.*;

/**
 *
 * @author 84384
 */
public class API {
    Connection cnn;
    Query query;
    Argon argon;
    public API() {
        cnn= new connect.Connect().getConnection();
        query= new Query();
        argon= new Argon();
    }
    
    public String CheckLogin(String user, String pass){
        try {
            PreparedStatement ps= cnn.prepareStatement(query.checkLogin);
            ps.setString(1, user);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {                
                String password= rs.getString(3);
                if(argon.checkArgon2(password, pass))
                    return rs.getString(1);
            }
            
        } catch (Exception e) {
            System.err.println("model.API.CheckLogin");
            e.printStackTrace();
        }
        return null;
    }
    public boolean checkContainID(String UID){
        try {
            PreparedStatement ps= cnn.prepareStatement(query.checkContainID);
            ps.setString(1, UID);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) return true;
            
        } catch (Exception e) {
            System.err.println("model.API.checkContainID");
            e.printStackTrace();
        }
        return false;
    }
}
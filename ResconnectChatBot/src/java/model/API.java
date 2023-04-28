/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import hash.Argon;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 84384
 */
public class API {

    Connection cnn;
    Query query;
    Argon argon;

    public API() {
        cnn = new connect.Connect().getConnection();
        query = new Query();
        argon = new Argon();
    }
//delete chat text;

    public void clearChatText(String UID) {
        String query = this.query.clearChatText;
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, UID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("model.API.clearChatText");
            e.printStackTrace();
        }
    }

    public String CheckLogin(String user, String pass) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.checkLogin);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String password = rs.getString(3);
                if (argon.checkArgon2(password, pass)) {
                    return rs.getString(1);
                }
            }

        } catch (Exception e) {
            System.err.println("model.API.CheckLogin");
            e.printStackTrace();
        }
        return null;
    }

    public boolean checkContainID(String UID) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.checkContainID);
            ps.setString(1, UID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            System.err.println("model.API.checkContainID");
            e.printStackTrace();
        }
        return false;
    }

    public void updateChattext(String UID, String user, String chat) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.insertChat);
            ps.setString(1, UID);
            ps.setString(2, "/&" + user + "&/" + "/*" + chat + "*/");
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("model.API.updateChattext");
            e.printStackTrace();
        }
    }

    public ArrayList<BoxChatInfor> getChatText(String UID) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.getChatTextAccUID);
            ps.setString(1, UID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String box = rs.getNString(2);
                return new control.Convert().convertStringToChat(box);

            }
        } catch (Exception e) {
            System.err.println("model.API.updateChattext");
            e.printStackTrace();
        }
        return null;
    }
}

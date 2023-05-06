/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TCNJK
 */
public class Vote {

    static Connection cnn;
    static Query query;

    public static boolean getVote(String uid, String cid) {
        cnn = new connect.Connect().getConnection();
        query = new Query();
        try {
            PreparedStatement ps = cnn.prepareStatement(query.selectVote);
            ps.setString(1, uid);
            ps.setString(2, cid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                boolean c=rs.getBoolean(1);
                return c;
            }
        } catch (Exception e) {
        }
        return false;
    }
}

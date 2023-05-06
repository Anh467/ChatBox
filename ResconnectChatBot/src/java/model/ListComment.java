/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import hash.Argon;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author TCNJK
 */
public class ListComment {

    ArrayList<Comment> comment;
    Connection cnn;
    Query query;
    Argon argon;

    public ListComment() {
    }

    public void setComment(ArrayList<Comment> comment) {
        this.comment = comment;
    }
    public  ArrayList<Comment> getComment(String postID){
        cnn = new connect.Connect().getConnection();
        query = new Query();
        argon = new Argon();
        ArrayList<Comment> list = new ArrayList<>();
        try {
            PreparedStatement ps = cnn.prepareStatement(query.getComment);
            ps.setString(1, postID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String uid = rs.getString(1);
                String uName = rs.getNString(2);
                String cid = rs.getString(3);
                Date cTime = rs.getDate(4);
                String cContent = rs.getString(5);
                int voteCount = rs.getInt(6);
                list.add(new Comment(uid, uName, cid, cContent, cTime, voteCount));
            }
        } catch (Exception e) {
            System.err.println("model.API.getPost");
            e.printStackTrace();
        }
        return list;
    }
}

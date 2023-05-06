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
public class ListPost {

    ArrayList<PostInfor> post;
    Connection cnn;
    Query query;
    Argon argon;

    public ListPost() {
    }

    public void setPost(ArrayList<PostInfor> post) {
        this.post = post;
    }

    public ArrayList<PostInfor> getPost() {
        cnn = new connect.Connect().getConnection();
        query = new Query();
        argon = new Argon();
        ArrayList<PostInfor> list = new ArrayList<>();
        try {
            PreparedStatement ps = cnn.prepareStatement(query.getPostToCommunity);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String postContent = rs.getString(3);
                String[] content = postContent.split("@#&");
                postContent = "User: " + content[0] + "<br>Chat: " + content[1] + "<br>";
                if (content.length>2){
                    postContent+="Problem Details: " + content[2] + "<br>";
                }
                for (int i = 3;  i<content.length ; i++) {
                    postContent+="#" + content[i]+" ";
                }
                Date postDate = rs.getDate(5);
                boolean postStatus = rs.getInt(4) == 1;
                String uid = rs.getString(1);
                String pid = rs.getString(2);
                String name = rs.getString(6);
                list.add(new PostInfor(uid, pid, postContent, postStatus, postDate, name));
            }

        } catch (Exception e) {
            System.err.println("model.API.getPost");
            e.printStackTrace();
        }

        return list;
    }
}

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
public class PostInShare {

    String pid, user, bot, problem, tag[];
    Connection cnn;
    Query query;

    public PostInShare() {
    }

    public PostInShare(String pid) {
        this.pid = pid;
        getFull();
    }

    public PostInShare(String pid, String user, String bot, String problem, String[] tag) {
        this.pid = pid;
        this.user = user;
        this.bot = bot;
        this.problem = problem;
        this.tag = tag;
    }
    
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBot() {
        return bot;
    }

    public void setBot(String bot) {
        this.bot = bot;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String[] getTag() {
        return tag;
    }

    public void setTag(String[] tag) {
        this.tag = tag;
    }

    

    public PostInShare getFull() {
        PostInShare res= new PostInShare();
        cnn = new connect.Connect().getConnection();
        query = new Query();
        try {
            PreparedStatement ps = cnn.prepareStatement("SELECT post.post_content FROM dbo.post \n"
                    + "WHERE post.post_id=?");
            ps.setString(1, pid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String postContent = rs.getString(1);
                String[] content = postContent.split("@#&");
                String user, bot, problem;
                String []tag= new String[3];
                user= content[0];
                bot= content[1];
                problem=content[2];
                for (int i = 3;  i<content.length ; i++) {
                    tag[i-3]=content[i];
                }
                for (int i = content.length;  i<6 ; i++) {
                    tag[i-3]="";
                }
                res=new PostInShare(pid, user, bot, problem, tag);
            }
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

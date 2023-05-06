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

    //get id
    public String getUID(String user) {
        String query = this.query.getUID;
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            System.err.println("model.API.checkExistAcc");
            e.printStackTrace();
        }
        return null;
    }
// create acc

    public boolean addNewAcc(String name, String mail, String user, String pass, String dbo) {
        String query = this.query.addNewAcc;
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, mail);
            ps.setString(3, user);
            ps.setString(4, pass);
            ps.setString(5, dbo);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("model.API.checkExistAcc");
            e.printStackTrace();
        }
        return false;
    }
//check exist

    public boolean checkExistAcc(String user) {
        String query = this.query.checkExistAcc;
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("model.API.checkExistAcc");
            e.printStackTrace();
        }
        return false;
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
                String password = rs.getString(8);
                if (argon.checkArgon2(password, pass)) {
                    return rs.getString(2);
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

    //POST
    public boolean UpdateToPostDB(String pid, String user, String chat, String detail, String tag1, String tag2, String tag3) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.UpdateToPost);
            ps.setString(1, user + "@#&" + chat + "@#&" + detail + "@#&" + tag1 + "@#&" + tag2 + "@#&" + tag3 + "@#&");
            ps.setString(2, pid);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("model.API.UpdateToPostDB");
            e.printStackTrace();
        }
        return false;
    }
    public boolean addToPostDB(String uid, String user, String chat, String detail, String tag1, String tag2, String tag3) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.addToPost);
            ps.setString(1, uid);
            ps.setString(2, user + "@#&" + chat + "@#&" + detail + "@#&" + tag1 + "@#&" + tag2 + "@#&" + tag3 + "@#&");
            ps.setInt(3, 1);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("model.API.addToPostDB");
            e.printStackTrace();
        }
        return false;
    }
    //COMMENT
    public boolean addComment(String userID, String postID, String comment_content) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.addComment);
            ps.setString(1, userID);
            ps.setString(2, postID);
            ps.setString(3, comment_content);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("model.API.addComment");
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteComment(String cid) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.deleteComment);
            ps.setString(1, cid);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("model.API.deleteComment");
            e.printStackTrace();
        }
        return false;
    }
    public boolean deletePost(String pid) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.deletePost);
            ps.setString(1, pid);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("model.API.deletePost");
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateComment(String contain,String cid){
        try {
            PreparedStatement ps = cnn.prepareStatement(query.updateComment);
            ps.setString(1, contain);
            ps.setString(2, cid);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("model.API.updateComment");
            e.printStackTrace();
        }
        return false;
    }
    //VOTE
    public boolean VoteAction(String uid, String cid, boolean status) {
        if (status == true) {
            addVote(uid, cid);
        } else {
            deleteVote(uid, cid);
        }

        return true;
    }

    private boolean addVote(String uid, String cid) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.addVote);
            ps.setString(1, uid);
            ps.setString(2, cid);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("model.API.addVote");
            e.printStackTrace();
        }
        return false;
    }

    private boolean deleteVote(String uid, String cid) {
        try {
            PreparedStatement ps = cnn.prepareStatement(query.deleteVote);
            ps.setString(1, uid);
            ps.setString(2, cid);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("model.API.deleteVote");
            e.printStackTrace();
        }
        return false;
    }
}

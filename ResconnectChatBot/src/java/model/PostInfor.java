package model;

import hash.Argon;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PostInfor {

    Connection cnn;
    Query query;
    String userID, postID, postContent;
    boolean postStatus;
    Date postDate;
    String Uname;
    ArrayList<Comment> list;

    public PostInfor() {
    }

    public PostInfor(String userID, String postID, String postContent, boolean postStatus, Date postDate, String Uname) {
        this.userID = userID;
        this.postID = postID;
        this.postContent = postContent;
        this.postStatus = postStatus;
        this.postDate = postDate;
        this.Uname = Uname;
    }
    
    public ArrayList<Comment> getList() {
       
        return list;
    }

    public void setList(ArrayList<Comment> list) {
        this.list = list;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public boolean isPostStatus() {
        return postStatus;
    }

    public void setPostStatus(boolean postStatus) {
        this.postStatus = postStatus;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    
}

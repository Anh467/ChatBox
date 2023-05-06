/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

/**
 *
 * @author 84384
 */
public class Query {

    public String DataBaseName = "chat";

    public String APIKey = "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";
    public String getUID = "	select user_id from dbo.users\n"
            + "            where user_account=?";
//sign up
    //check exist account
    public String checkExistAcc = "select * \n"
            + "from dbo.users\n"
            + "where user_account= ?";
    /*
    1- full name
    2- mail
    3- user
    4- pass
    5- date of birth
     */
    public String addNewAcc = "insert into dbo.users\n"
            + "values\n"
            + "(   ?  -- user_name - nvarchar(127)\n"
            + "  , ? -- user_mail - varchar(255)\n"
            + "  , ''  -- avatar_url - varchar(1027)\n"
            + "  , 'abc hehe'  -- introduce - varchar(255)\n"
            + "  , ? -- user_account - varchar(127)\n"
            + "  , ? -- user_password - varchar(100)\n"
            + "  , GETDATE()\n"
            + "  , ? \n"
            + "   , 0   -- follower - int\n"
            + "    )";

    public String checkLogin = "select * from dbo.users\n"
            + "where user_account=?";
    public String checkContainID = "select * from dbo.users\n"
            + "where user_id=?";
//first is user id and second one is chat text
    public String insertChat = "DECLARE @user_id varchar(11);\n"
            + "SET @user_id = ?;\n"
            + "DECLARE @chat_text nvarchar(max);\n"
            + "DECLARE @text nvarchar(max);\n"
            + "set @chat_text= ?;\n"
            + "set @text= (\n"
            + "	select chat_text\n"
            + "from dbo.userBoxchat\n"
            + "where user_id= @user_id\n"
            + ") \n"
            + "set @text= @text +@chat_text\n"
            + "  IF EXISTS(SELECT chat_text FROM dbo.userBoxchat WHERE user_id= @user_id)\n"
            + "	update dbo.userBoxchat\n"
            + "	set chat_text=@text\n"
            + "	where user_id=@user_id;\n"
            + "else insert into dbo.userBoxchat\n"
            + "values\n"
            + "(   @user_id   -- user_id - varchar(11)\n"
            + "  , @chat_text-- chat_text - varbinary(max)\n"
            + "  , 0 -- status - bit\n"
            + "    )";
    public String getChatTextAccUID = "select *\n"
            + "from userBoxchat\n"
            + "where user_id= ?;";
    public String clearChatText = "update dbo.userBoxchat\n"
            + "SET  chat_text= ''\n"
            + "where user_id=?;";
    //POST
    public String addToPost = "INSERT INTO dbo.post\n"
            + "(\n"
            + "    user_id,\n"
            + "    post_content,\n"
            + "    post_status\n"
            + ")\n"
            + "VALUES\n"
            + "(   ?,       -- user_id - varchar(11)\n"
            + "    ?,       -- post_content - varchar(max)\n"
            + "    ?			      -- post_status - int\n"
            + "    )";
    public String UpdateToPost = "UPDATE dbo.post \n"
            + "SET post.post_content=?\n"
            + "WHERE post.post_id=?";

    public String getPostToCommunity = "SELECT post.user_id,post.post_id,post.post_content,post.post_status,post.post_date, users.user_name\n"
            + "FROM dbo.post \n"
            + "INNER JOIN dbo.users ON users.user_id = post.user_id\n"
            + "ORDER BY post.post_date DESC";
    public String deletePost = "DELETE FROM dbo.post \n"
            + "WHERE post.post_id=? ";
//COMMENT
    public String addComment = "INSERT INTO dbo.comment\n"
            + "(\n"
            + "    user_id,\n"
            + "    post_id,\n"
            + "    voted_count,\n"
            + "    comment_content\n"
            + ")\n"
            + "VALUES\n"
            + "(   ?,        -- user_id - varchar(11)\n"
            + "    ?,        -- post_id - varchar(11)\n"
            + "    0,         -- voted_count - int\n"
            + "    ?         -- comment_content - varchar(max)\n"
            + "    )";
    public String getComment = "SELECT comment.user_id,users.user_name,comment.comment_id,comment.comment_time,comment.comment_content,comment.voted_count \n"
            + "FROM dbo.comment \n"
            + "INNER JOIN dbo.users ON users.user_id = comment.user_id\n"
            + "WHERE comment.post_id=?";
    public String updateComment = "UPDATE dbo.comment\n"
            + "SET comment.comment_content = ?\n"
            + "WHERE comment.comment_id = ?";
    public String deleteComment = "DELETE FROM dbo.comment\n"
            + "WHERE comment.comment_id = ?";
    //VOTE
    public String addVote = "INSERT INTO dbo.vote\n"
            + "(\n"
            + "    user_id,\n"
            + "    comment_id,\n"
            + "    vote_status\n"
            + ")\n"
            + "VALUES\n"
            + "(   ?,  -- user_id - varchar(11)\n"
            + "    ?,  -- comment_id - varchar(11)\n"
            + "    1 -- vote_status - bit\n"
            + "    )";
    public String deleteVote = "DELETE FROM dbo.vote \n"
            + "WHERE vote.user_id=? "
            + "AND vote.comment_id=?";
    public String selectVote = "SELECT vote.vote_status FROM dbo.vote\n"
            + "WHERE vote.user_id=? AND vote.comment_id=?";
}

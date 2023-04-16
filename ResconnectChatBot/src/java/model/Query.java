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

    public String DataBaseName = "chat12346";

    public String APIKey = "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";

    public String checkLogin = "select * from dbo.userAccount\n"
            + "where user_account=?";
    public String checkContainID = "select * from dbo.userAccount\n"
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
            + "  , @text-- chat_text - varbinary(max)\n"
            + "  , 0 -- status - bit\n"
            + "    )";
}

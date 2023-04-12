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

    public String APIKey= "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";
    
    public String checkLogin = "select * from dbo.userAccount\n"
            + "where user_account=?";
    public String checkContainID = "select * from dbo.userAccount\n"
            + "where user_id=?";
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84384
 */
public class Query {

    //check user account
    public String checkUserAccount() {
        return "select * from dbo.userAccount\n"
                + "where user_account= ? and user_password= ?";
    }
}

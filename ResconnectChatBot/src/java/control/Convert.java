/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package control;

import java.util.ArrayList;
import model.BoxChatInfor;

/**
 *
 * @author 84384
 */
public class Convert {
///&i love you&//*I love you too!*//&i love you'&//*I love you too!*//&tell me about nosql&//*
    public ArrayList<BoxChatInfor> convertStringToChat(String box){
        ArrayList<BoxChatInfor> str= new ArrayList<>();
        while (box.length()!=0){
            int n1= box.indexOf("/&");
            int n2= box.indexOf("&/");
            int m1= box.indexOf("/*");
            int m2= box.indexOf("*/");
            String s1= box.substring(n1+2, n2);
            String s2= box.substring(m1+2, m2-1);
            str.add(new BoxChatInfor(s1, s2));
            box= box.substring(m2+2);
        }
        return str;
    }
}

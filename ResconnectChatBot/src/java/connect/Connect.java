/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connect {

    String databaseName = new model.Query().DataBaseName;
    String user = "sa";
    String password = "lioooo0000";

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-ULQ9JUL\\TCNJK:1433;databaseName=" + databaseName + "; Encrypt=false;";
            Connection con = DriverManager.getConnection(connectionUrl, user, password);
            System.out.println("True at connection/ connect2");
            return con;
        } catch (Exception e) {
            System.out.println("false at connection/ connect2");
            e.printStackTrace();
        }
        return null;

    }
}

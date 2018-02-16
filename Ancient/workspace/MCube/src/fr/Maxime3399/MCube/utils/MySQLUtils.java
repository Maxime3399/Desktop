package fr.Maxime3399.MCube.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.bukkit.configuration.Configuration;

import fr.Maxime3399.MCube.MainClass;

public class MySQLUtils {
	
	private static Configuration conf = MainClass.getInstance().getConfig();
	
    private static String url = "jdbc:mysql://"+conf.getString("Adress")+":3306/m-cube?useSSL=false";
    private static String user = conf.getString("User");
    private static String passwd = conf.getString("Password");
    
    public static Statement state;
	
    public static void connect(){

        try {
        	
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException e1) {
        	
            e1.printStackTrace();
            
        }

        try {

			Connection conn = DriverManager.getConnection(url, user, passwd);
            state = conn.createStatement();
            
        } catch (SQLException e) {
        	
            e.printStackTrace();
            
        }

    }

}

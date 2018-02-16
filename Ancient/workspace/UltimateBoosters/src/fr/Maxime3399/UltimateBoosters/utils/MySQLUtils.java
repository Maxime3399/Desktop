package fr.Maxime3399.UltimateBoosters.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.bukkit.Bukkit;

public class MySQLUtils {
	
    private static String url = "jdbc:mysql://"+Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("Adress");
    private static String user = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("User");
    private static String passwd = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("Password");
    
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

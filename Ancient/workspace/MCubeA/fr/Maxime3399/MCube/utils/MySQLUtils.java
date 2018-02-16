package fr.Maxime3399.MCube.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLUtils
{
  private static String url = "jdbc:mysql://localhost:3306/mcube";
  private static String user = "root";
  private static String passwd = "pokemon38";
  public static Statement state;
  
  public MySQLUtils() {}
  
  public static void connect()
  {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }
    catch (ClassNotFoundException e1)
    {
      e1.printStackTrace();
    }
    

    try
    {
      Connection conn = DriverManager.getConnection(url, user, passwd);
      state = conn.createStatement();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }
}

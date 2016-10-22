/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement; 
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import org.sqlite.SQLiteDataSource;
//import org.sqlite.SQLiteJDBCLoader;
/**
 *
 * @author Student
 */
public class DBUtils 
		
{
	  static String dbURL ="jdbc:mysql://137.158.160.145:3306/ngwphu001";
	  static String DRIVER = "com.mysql.jdbc.Driver";
	  static String loginName = "ngwphu001";
	  static String password = "eupheyei";
	  
	  
	  public static Connection getConnection() throws SQLException
	  {
		  return DriverManager.getConnection(dbURL,loginName,password);
	  }
      public static PreparedStatement getPreparedSatement(String sql) throws ClassNotFoundException
      {
          PreparedStatement initialize=null;
          try
          {

        	 Class.forName ( DRIVER ); 	//Load a driver	
             Connection c =DriverManager.getConnection(dbURL,loginName,password);	//Make a connection
            initialize=c.prepareStatement(sql);
          }
          catch (SQLException ex) 
          {
                ex.printStackTrace();
          }
        return initialize;
      }
      
      
      public static void main(String[]args) throws ClassNotFoundException
      {
        
        System.out.println("Opened database successfully");
        getPreparedSatement("Select * from Users");
      }
        
    
}

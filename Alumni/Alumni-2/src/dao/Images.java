/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.*;
import db.DBUtils;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Class to retrieve Images from the database
 * @author Lorna Nqodi
 */
public class Images {
    
    
    public static void addPhoto(String uid) 
    {
//        try 
//        {
//            //Create connection
//            Connection conn = DBUtils.getConnection();
//            //Create file object for reading file
//            File imgFile = new File("pic.jpg");
//            //Test whether file exists
//            
//            FileInputStream fis = new FileInputStream(imgFile);
//          
//            PreparedStatement stmt = DBUtils.getPreparedSatement("INSERT into Images values(?,?)");
//            stmt.setString(1, "uid");
//            stmt.setBinaryStream(2, (Inputstream)fis );
//            stmt.executeUpdate();
//            System.out.println("Added image susccessfully");
//    
//      
//        }   catch (FileNotFoundException ex) {
//            Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
        
//    public static byte[] getPhoto(String photId)throws Exception, SQLException
//    {
//        String req = "" ;
//        Blob img ;
//        byte[] imgData = null ;
//        Statement stmt = DBUtils.getConnection().createStatement();
//        // Query
//        req = "SELECT image From IMAGES Where ID ='"+photId+"'" ;
//    
//        ResultSet rs = stmt.executeQuery ( req );
//    
//        while (rs.next ())
//        {    
//          img = rs.getBlob(2);
//          imgData = img.getBytes(1,(int)img.length());
//        } 
//    
//        rs.close();
//        stmt.close();
//    
//    return imgData ;
//        
//    }
//    
//    public static void getPic(String uid)
//    {
//        try {
//            Connection conn = DBUtils.getConnection();
//            PreparedStatement stmt = DBUtils.getPreparedSatement("Select into Images values(?,?)");
//        } catch (SQLException ex) {
//            Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
        }  
}

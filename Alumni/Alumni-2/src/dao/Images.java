/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import db.DBUtils;
import java.sql.*;
import java.io.*;
import java.util.*;

/**
 *  Class to retrieve Images from the database
 * @author Lorna Nqodi
 */
public class Images {
    
    public static byte[] getPhoto(String photId)throws Exception, SQLException
    {
        String req = "" ;
        Blob img ;
        byte[] imgData = null ;
        Statement stmt = DBUtils.getConnection().createStatement();
        // Query
        req = "SELECT image From IMAGES Where ID ='"+photId+"'" ;
    
        ResultSet rs = stmt.executeQuery ( req );
    
        while (rs.next ())
        {    
          img = rs.getBlob(2);
          imgData = img.getBytes(1,(int)img.length());
        } 
    
        rs.close();
        stmt.close();
    
    return imgData ;
        
    }
    
}

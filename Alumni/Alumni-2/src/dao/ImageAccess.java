/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtils;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorna Nqodi
 */
public class ImageAccess 
{
    
    public static void uploadPhoto(String id, InputStream inputStream) throws SQLException
    {
        String message = null; 
        
        String sql = "INSERT INTO Images (id, photo) values (?, ?)";
        try {
                PreparedStatement ps = DBUtils.getPreparedSatement(sql);
                System.out.println("db open");
                ps.setString(1, id);
                System.out.println("setting id");
                if (inputStream != null) {
                
                // fetches input stream of the upload file for the blob column
                ps.setBlob(2, inputStream);
                    System.out.println("inserting image");
                
                int row = 1;
                    System.out.println("row = 1");
                        
                ps.executeUpdate();
                if (row > 0) {
                    message = "File uploaded and saved into database";
                    System.out.println(message);
                }
            }
                
            } 
            catch (ClassNotFoundException ex){
                ex.printStackTrace();  
            }            
            catch(SQLException e) {
                message = "ERROR: " + e.getMessage();
                System.out.println(message);
                
            }         
        
    }
    
    
    
    
    public static byte[] displayPhoto(String id){
        Blob img  = null;
        byte[] imgData = null;

        String sqlQuery = "SELECT photo From Images Where ID = '"+id+"'" ;
        
        try {
            PreparedStatement stmt = DBUtils.getPreparedSatement(sqlQuery);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next ())
            {   
                //response.setContentType("image/png");
                img = rs.getBlob(1);
                imgData = img.getBytes(1,(int)img.length());
                
            }
            rs.close();
            stmt.close();
        }   catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return imgData;
    }
    
    
    public static byte[] displayImage(String id){
        Blob img  = null;
        byte[] imgData = null;

        String sqlQuery = "SELECT image From Posts Where PostId = '"+id+"'" ;
        
        try {
            PreparedStatement stmt = DBUtils.getPreparedSatement(sqlQuery);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next ())
            {   
                //response.setContentType("image/png");
                img = rs.getBlob(1);
                imgData = img.getBytes(1,(int)img.length());
                
            }
            rs.close();
            stmt.close();
        }   catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return imgData;
    }
    
}

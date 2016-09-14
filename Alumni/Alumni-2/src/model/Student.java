/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lorna Nqodi
 */
public class Student extends User{
    
    public Student(String userID, String firstName, String lastName, String email, String passWord, String accountType) {
        super(userID, firstName, lastName, email, passWord, accountType);
    }
    
}

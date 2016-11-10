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
public class Profile {
    private String id = "";
    private String fname = "";
    private String lname = "";
    private String occupation = "";
    private String currentCompany = "";
    private String address1 = "";
    private String address2 = "";
    private String city = "";
    private String postalCode = "";
    private String phone = "";
    private String email = "";
    private String highest_degree = "";
    private String inst1 = "";
    private String major1_1 = "";
    private String major1_2 = "";
    private String highest_degree_year = "";
    private String school = "";
    private String school_year = "";
    private String job1 = "";
    private String job1Company = "";
    private String job1Year = "";
    private String job2 = "";
    private String job2Company = "";
    private String job2Year = "";
    private String skill1 = "";
    private String skill2 = "";
    private String skill3 = "";
    private String skill4 = "";
    private String skill5 = "";
    private String refName1;
    private String refEmail1 = "";
    private String refName2;
    private String refEmail2;
    

    public String getRefEmail1() {
        return refEmail1;
    }

    public void setRefEmail1(String refEmail1) {
        this.refEmail1 = refEmail1;
    }

    public String getRefName1() {
        return refName1;
    }

    public void setRefName1(String refName1) {
        this.refName1 = refName1;
    }

    public String getRefName2() {
        return refName2;
    }

    public void setRefName2(String refName2) {
        this.refName2 = refName2;
    }

    public String getRefEmail2() {
        return refEmail2;
    }

    public void setRefEmail2(String refEmail2) {
        this.refEmail2 = refEmail2;
    }

    public String getCurrentCompany() {
        return currentCompany;
    }

    public void setCurrentCompany(String currentCompany) {
        this.currentCompany = currentCompany;
    }
    
    public Profile() {
       super();
    }   
    
//    public Profile(String id, String fname, String lname, String occupation, String address1, 
//            String address2, String city, String postalCode, String phone, String email, String highest_degree, 
//            String inst1, String major1_1, String major1_2, String highest_degree_year, String degree2, String inst2, String major2_1, String major2_2, 
//            String degree2Year, String school, String school_year,String job1, String job1Company, String job1Year, String job2, String job2Company, 
//            String job2Year, String skill1, String skill2, String skill3, String skill4, String skill5, String refName1)
//    {
//        this.id = id;
//        this.fname = fname;
//        this.lname = lname;
//        this.occupation = occupation;
//        this.address1 = address1;
//        this.address2 = address2;
//        this.city = city;
//        this.postalCode = postalCode;
//        this.phone = phone;
//        this.email = email;
//        this.highest_degree = highest_degree;
//        this.inst1 = inst1;
//        this.major1_1 = major1_1;
//        this.major1_2 = major1_2;
//        this.highest_degree_year = highest_degree_year;
//        this.degree2 = degree2;
//        this.inst2 = inst2;
//        this.major2_1 = major2_1;
//        this.major2_2 = major2_2;
//        this.degree2Year = degree2Year;
//        this.school = school;
//        this.school_year = school_year;
//        this.skill1 = skill1;
//        this.skill2 = skill2;
//        this.skill3 = skill3;
//        this.skill4 = skill4;
//        this.skill5 = skill5;
//    }
    
        public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHighest_degree() {
        return highest_degree;
    }

    public void setHighest_degree(String highest_degree) {
        this.highest_degree = highest_degree;
    }

    public String getInst1() {
        return inst1;
    }

    public void setInst1(String inst1) {
        this.inst1 = inst1;
    }

    public String getMajor1_1() {
        return major1_1;
    }

    public void setMajor1_1(String major1_1) {
        this.major1_1 = major1_1;
    }

    public String getMajor1_2() {
        return major1_2;
    }

    public void setMajor1_2(String major1_2) {
        this.major1_2 = major1_2;
    }

    public String getHighest_degree_year() {
        return highest_degree_year;
    }

    public void setHighest_degree_year(String highest_degree_year) {
        this.highest_degree_year = highest_degree_year;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool_year() {
        return school_year;
    }

    public void setSchool_year(String school_year) {
        this.school_year = school_year;
    }

    public String getJob1() {
        return job1;
    }

    public void setJob1(String job1) {
        this.job1 = job1;
    }

    public String getJob1Company() {
        return job1Company;
    }

    public void setJob1Company(String job1Company) {
        this.job1Company = job1Company;
    }

    public String getJob1Year() {
        return job1Year;
    }

    public void setJob1Year(String job1Year) {
        this.job1Year = job1Year;
    }

    public String getJob2() {
        return job2;
    }

    public void setJob2(String job2) {
        this.job2 = job2;
    }

    public String getJob2Company() {
        return job2Company;
    }

    public void setJob2Company(String job2Company) {
        this.job2Company = job2Company;
    }

    public String getJob2Year() {
        return job2Year;
    }

    public void setJob2Year(String job2Year) {
        this.job2Year = job2Year;
    }

    
    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getSkill4() {
        return skill4;
    }

    public void setSkill4(String skill4) {
        this.skill4 = skill4;
    }

    public String getSkill5() {
        return skill5;
    }

    public void setSkill5(String skill5) {
        this.skill5 = skill5;
    }
}

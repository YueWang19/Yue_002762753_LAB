/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Yue
 */
public class Person {
    String NUID;
    String firstName;
    String lastName;
    String collegeName;
    Address currentAddress;
    Address permanentAddress;
    ContactInfo officeContactInfo;
    ContactInfo personalContactInfo;
    
    
    public Person(){ // right click getter and setter
        this.NUID = "";
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        this.currentAddress = new Address();
        this.permanentAddress = new Address();
        this.officeContactInfo = new ContactInfo();
        this.personalContactInfo = new ContactInfo();
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

     public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }
    

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public ContactInfo getOfficeContactInfo() {
        return officeContactInfo;
    }

    public void setOfficeContactInfo(ContactInfo officeContactInfo) {
        this.officeContactInfo = officeContactInfo;
    }

    public ContactInfo getPersonalContactInfo() {
        return personalContactInfo;
    }

    public void setPersonalContactInfo(ContactInfo personalContactInfo) {
        this.personalContactInfo = personalContactInfo;
    }
    
    public static void main(String[] args) {
        Person obj = new Person();
        
        obj.setFirstName("Yue");
        
        Address addr = obj.getCurrentAddress();
        addr.setStreetName("Boston");
        
        System.out.println(obj.getFirstName() + " " + addr.getStreetName());
    }

    
}

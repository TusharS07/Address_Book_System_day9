package com.Bridgelabz.Address_Book_System;

public class UserData {
    //declare user contact details data
    String firstName;
    String lastName;
    long phoneNumber;
    String emailID;
    String address;
    String cityName;
    String stateName;
    int zipCode;



    //Constructor created
    public UserData(String firstName, String lastName, long phoneNumber, String emailID, String address, String cityName, String stateName, int zipCode) {
    //assign parameter
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
        this.address = address;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }





    public String toString() {
        System.out.println();
        return "First Name: " + firstName + " \nLast Name: " + lastName + " \nContact number: "+ phoneNumber + " \nEmail ID: " + emailID + " \nAddress: " + address + " \nCity Name: " + cityName + " \nState Name: " + stateName + " \nPostal Code(Zip Code): " + zipCode + "\n";

    }

}

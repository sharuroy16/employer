package com.example.employer.DTO;

public class EmployerDTO {
    
    private int employerID;
    private String employerName;
    private String employerEmail;

    public EmployerDTO(int employerID, String employerName, String employerEmail) {
        this.employerID = employerID;
        this.employerName = employerName;
        this.employerEmail = employerEmail;
    }

    public EmployerDTO() {
    }

    public int getEmployerID() {
        return employerID;
    }

    public void setEmployerID(int employerID) {
        this.employerID = employerID;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerEmail() {
        return employerEmail;
    }

    public void setEmployerEmail(String employerEmail) {
        this.employerEmail = employerEmail;
    }

    @Override
    public String toString() {
        return "{" +
            " employerID='" + getEmployerID() + "'" +
            ", employerName='" + getEmployerName() + "'" +
            ", employerEmail='" + getEmployerEmail() + "'" +
            "}";
    }
}
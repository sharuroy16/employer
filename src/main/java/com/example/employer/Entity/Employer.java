package com.example.employer.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employer")
public class Employer {
    
    @Id
    @Column(name = "employer_id", length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employerID;

    @Column(name = "employer_name", length = 50)
    private String employerName;

    @Column(name = "employer_email", length = 60)
    private String employerEmail;

    public Employer(int employerID, String employerName, String employerEmail){
        this.employerID = employerID;
        this.employerName = employerName;
        this.employerEmail = employerEmail;
    }

    public Employer(String employerName, String employerEmail){
        this.employerName = employerName;
        this.employerEmail = employerEmail;
    }

    public Employer(){
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
package com.example.employer.DTO;

public class EmployerSaveDTO {
    
    private String employerName;
    private String employerEmail;

    public EmployerSaveDTO(String employerName, String employerEmail) {
        this.employerName = employerName;
        this.employerEmail = employerEmail;
    }

    public EmployerSaveDTO() {
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
            " employerName='" + getEmployerName() + "'" +
            ", employerEmail='" + getEmployerEmail() + "'" +
            "}";
    }
}

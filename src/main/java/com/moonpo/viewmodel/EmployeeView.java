package com.moonpo.viewmodel;


public class EmployeeView {
    private String id;
    private String no;
    private String name;
    private String photo;
    private String dateOfBirth;
    private String gender;
    private String issueDate;
    private String address;

    public EmployeeView() {

    }

    public EmployeeView(String id, String no, String name, String photo, String dateOfBirth, String gender, String issueDate, String address) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.photo = photo;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.issueDate = issueDate;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

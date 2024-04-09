package com.moonpo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "emprg_mstr")
public class Employee {
    @Id
    @Column(name = "emprg_id")
    private String id;
    @Column(name = "emprg_cid")
    private String no;
    @Column(name = "emprg_name")
    private String name;
    @Column(name = "emprg_photo")
    private String photo;
    @Column(name = "emprg_dob")
    private String dateOfBirth;
    @Column(name = "emprg_sex")
    private String gender;
    @Column(name = "emprg_cid_iss_date")
    private String issueDate;
    @Column(name = "emprg_addr")
    private String address;
    @Column(name = "emprg_added")
    private Timestamp addedDate;


    public Employee() {
    }

    public Employee(String id, String no, String name, String photo, String dateOfBirth, String gender, String issueDate, String address) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.photo = photo;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.issueDate = issueDate;
        this.address = address;
    }

    public Employee(String id, String no, String name, String photo, String dateOfBirth, String gender, String issueDate, String address, Timestamp addedDate) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.photo = photo;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.issueDate = issueDate;
        this.address = address;
        this.addedDate = addedDate;
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

    public Timestamp getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Timestamp addedDate) {
        this.addedDate = addedDate;
    }
}

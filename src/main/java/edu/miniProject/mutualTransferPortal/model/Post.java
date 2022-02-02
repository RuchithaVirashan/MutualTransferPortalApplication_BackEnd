package edu.miniProject.mutualTransferPortal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private String username;
    private String NIC;
    private String email;
    private String phone;
    private String designation;
    private String perferedCity;
    private String perferedDistrict;
    private String description;
    private String currentWorkingCity;
    private String currentWorkingDistrict;
    private String currentWorkingPlace;


    //user
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    public Post() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post(Long postId, String username, String NIC, String email, String phone, String designation, String perferedCity, String perferedDistrict, String description, String currentWorkingCity, String currentWorkingDistrict, String currentWorkingPlace, User user) {
        this.postId = postId;
        this.username = username;
        this.NIC = NIC;
        this.email = email;
        this.phone = phone;
        this.designation = designation;
        this.perferedCity = perferedCity;
        this.perferedDistrict = perferedDistrict;
        this.description = description;
        this.currentWorkingCity = currentWorkingCity;
        this.currentWorkingDistrict = currentWorkingDistrict;
        this.currentWorkingPlace = currentWorkingPlace;
        this.user = user;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPerferedCity() {
        return perferedCity;
    }

    public void setPerferedCity(String perferedCity) {
        this.perferedCity = perferedCity;
    }

    public String getPerferedDistrict() {
        return perferedDistrict;
    }

    public void setPerferedDistrict(String perferedDistrict) {
        this.perferedDistrict = perferedDistrict;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrentWorkingCity() {
        return currentWorkingCity;
    }

    public void setCurrentWorkingCity(String currentWorkingCity) {
        this.currentWorkingCity = currentWorkingCity;
    }

    public String getCurrentWorkingDistrict() {
        return currentWorkingDistrict;
    }

    public void setCurrentWorkingDistrict(String currentWorkingDistrict) {
        this.currentWorkingDistrict = currentWorkingDistrict;
    }

    public String getCurrentWorkingPlace() {
        return currentWorkingPlace;
    }

    public void setCurrentWorkingPlace(String currentWorkingPlace) {
        this.currentWorkingPlace = currentWorkingPlace;
    }

}

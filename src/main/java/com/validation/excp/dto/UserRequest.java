package com.validation.excp.dto;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

public class UserRequest {

    @Id
    @GeneratedValue
    private int userId;

    @NotNull(message = "Name Can't be Empty")
    @NotBlank
    private String name;

    @NotNull
    @Email(message = "Invalid Email address")
    private String email;

    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile Number")
    private String mobile;

    @NotBlank
    private String gender;

    @Min(18)
    @Max(70)
    private int age;

    @NotNull
    private String nationality;

    public UserRequest() {
    }

    public UserRequest(String name, String email, String mobile, String gender, int age, String nationality) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}

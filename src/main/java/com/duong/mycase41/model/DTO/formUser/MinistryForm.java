package com.duong.mycase41.model.DTO.formUser;



import com.duong.mycase41.model.AppUser;
import com.duong.mycase41.model.Gender;
import org.springframework.web.multipart.MultipartFile;


public class MinistryForm {
    private Long id;
    private AppUser appUser;
    private String fullName;
    private String phoneNumber;
    private MultipartFile avatar;
    private String email;
    private Gender gender;
    private String dateOfBirth;
    private String address;


    public MinistryForm() {
    }

    public MinistryForm(Long id, AppUser appUser, String fullName, String phoneNumber, MultipartFile avatar, String email, Gender gender, String dateOfBirth, String address) {
        this.id = id;
        this.appUser = appUser;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.avatar = avatar;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public MinistryForm(AppUser appUser, String fullName, String phoneNumber, MultipartFile avatar, String email, Gender gender, String dateOfBirth, String address) {
        this.appUser = appUser;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.avatar = avatar;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

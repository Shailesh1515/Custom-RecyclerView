package com.food.customrecyclerview;

public class PersonUtils {
    private String personName;
    private String jobProfile;
    private String id;
    private String userImg;


    public PersonUtils(String personName, String jobProfile, String id, String userImg) {
        this.personName = personName;
        this.jobProfile = jobProfile;
        this.id = id;
        this.userImg = userImg;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }
}

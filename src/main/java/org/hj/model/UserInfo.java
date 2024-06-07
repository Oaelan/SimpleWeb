package org.hj.model;

public class UserInfo {
    private String id;
    private String password;
    private String name;
    private String gender;
    private String homenum;
    private String phonecall;
    private String email;
    
    
    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 // name 필드의 게터와 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // gender 필드의 게터와 세터
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // homenum 필드의 게터와 세터
    public String getHomenum() {
        return homenum;
    }

    public void setHomenum(String homenum) {
        this.homenum = homenum;
    }

    // phonecall 필드의 게터와 세터
    public String getPhonecall() {
        return phonecall;
    }

    public void setPhonecall(String phonecall) {
        this.phonecall = phonecall;
    }

    // email 필드의 게터와 세터
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

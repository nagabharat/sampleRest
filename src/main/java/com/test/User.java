package com.test;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by synycs on 12/9/16.
 */
@XmlRootElement
public class User {
    private String userId;
    public User(){

    }
    public User(String userId,String password){
        this.userId=userId;
        this.password=password;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String password;

}

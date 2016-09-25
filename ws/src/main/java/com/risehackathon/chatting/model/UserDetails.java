package com.risehackathon.chatting.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * Created by xps on 9/22/2016.
 */
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String userName;

    private String email;

    private String mobile;

    private String address;

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }
}

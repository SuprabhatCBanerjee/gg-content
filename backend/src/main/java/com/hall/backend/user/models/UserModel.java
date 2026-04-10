package com.hall.backend.user.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel {

    private long userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String userPasswordHash;
    private UserLocationModel userLocation = null;
    private String userImage;
    private String userInterest;

    public UserModel(String userName, String userEmail, String userPhone, String userPasswordHash) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userPasswordHash = userPasswordHash;
    }
     
}

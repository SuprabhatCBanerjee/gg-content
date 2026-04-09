package com.hall.backend.user.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLocationModel {
    
    private long locationId;
    private String userCity;
    private String userState;
    private String useZipCode;
    private String userLandmark;
    private String userCountry;
    
    public UserLocationModel(String userCity, String userState, String userCountry) {
        this.userCity = userCity;
        this.userState = userState;
        this.userCountry = userCountry;
    }

    
}

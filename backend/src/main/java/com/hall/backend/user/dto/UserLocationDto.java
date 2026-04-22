package com.hall.backend.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLocationDto {
    
    private long locationId;
    private String userCity;
    private String userState;
    private String useZipCode;
    private String userLandmark;
    private String userCountry;
    
    public UserLocationDto(String userCity, String userState, String userCountry) {
        this.userCity = userCity;
        this.userState = userState;
        this.userCountry = userCountry;
    }
}

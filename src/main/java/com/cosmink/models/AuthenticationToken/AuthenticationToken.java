package com.cosmink.models.AuthenticationToken;

import com.cosmink.models.AuthenticationTokenDetails.AuthenticationTokenDetails;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuthenticationToken {

    private String token;

    private AuthenticationTokenDetails authenticationTokenDetails;

    public AuthenticationTokenDetails getAuthenticationTokenDetails() {
        return authenticationTokenDetails;
    }

    public void setAuthenticationTokenDetails(AuthenticationTokenDetails authenticationTokenDetails) {
        this.authenticationTokenDetails = authenticationTokenDetails;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

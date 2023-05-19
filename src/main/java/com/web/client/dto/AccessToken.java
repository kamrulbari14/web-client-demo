package com.web.client.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccessToken {
    private String access_token;
    private String error;

    public AccessToken(String error) {
        this.error = error;
    }
}

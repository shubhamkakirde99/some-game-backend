package com.example.somegamebackend.dtos;

import lombok.Data;

@Data
public class PostDto {

    public PostDto(Boolean successStatus) {
        this.successStatus = successStatus;
    }

    private Boolean successStatus;

    private String message;
}

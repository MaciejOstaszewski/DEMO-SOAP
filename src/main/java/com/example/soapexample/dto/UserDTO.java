package com.example.soapexample.dto;

import com.example.soapexample.mapper.Dto;
import lombok.Data;

@Data
public class UserDTO implements Dto {

    private Long id;

    private String login;

    private String firstName;

    private String lastName;
}

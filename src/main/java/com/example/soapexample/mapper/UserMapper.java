package com.example.soapexample.mapper;

import com.example.soapexample.dto.UserDTO;
import com.example.soapexample.soap.UserSoap;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper implements Mapper<UserSoap, UserDTO> {

    private final ModelMapper modelMapper;

    @Override
    public UserSoap toSoap(UserDTO userDTO) {
        return modelMapper.map(userDTO, UserSoap.class);
    }

    @Override
    public UserDTO toDto(UserSoap soap) {
        return modelMapper.map(soap, UserDTO.class);
    }
}

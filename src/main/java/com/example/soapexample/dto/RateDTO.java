package com.example.soapexample.dto;

import com.example.soapexample.domain.Movie;
import com.example.soapexample.domain.UserEntity;
import com.example.soapexample.mapper.Dto;
import lombok.Data;

@Data
public class RateDTO implements Dto {

    private Long id;

    private Integer rate;

    private Long movieId;

    private Long authorId;

    private UserEntity author;

    private Movie movie;
}

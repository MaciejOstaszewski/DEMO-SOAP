package com.example.soapexample.dto;

import com.example.soapexample.domain.Movie;
import com.example.soapexample.domain.UserEntity;
import com.example.soapexample.mapper.Dto;
import lombok.Data;

import java.time.LocalDate;


@Data
public class ReviewDTO implements Dto {
    private Long id;

    private String content;

    private LocalDate creationDate;

    private Long movieId;

    private Long authorId;

    private UserEntity author;

    private Movie movie;
}

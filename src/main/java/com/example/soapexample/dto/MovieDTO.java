package com.example.soapexample.dto;

import com.example.soapexample.domain.UserEntity;
import com.example.soapexample.mapper.Dto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class MovieDTO implements Dto {
    private Long id;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private String director;
    private BigDecimal budget;
    private Instant creationDate;
    private Long authorId;
    private UserEntity author;
    private List<UserEntity> movieLikes = new ArrayList<>();

}

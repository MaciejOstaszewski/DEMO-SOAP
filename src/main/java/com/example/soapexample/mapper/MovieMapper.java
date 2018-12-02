package com.example.soapexample.mapper;


import com.example.soapexample.dto.MovieDTO;
import com.example.soapexample.soap.MovieSoap;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MovieMapper implements Mapper<MovieSoap, MovieDTO>{

    private final ModelMapper modelMapper;

    @Override
    public MovieSoap toSoap(MovieDTO movieDTO) {
        return modelMapper.map(movieDTO, MovieSoap.class);
    }

    @Override
    public MovieDTO toDto(MovieSoap movieSoap) {
        return modelMapper.map(movieSoap, MovieDTO.class);
    }
}

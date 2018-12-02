package com.example.soapexample.mapper;

import com.example.soapexample.dto.ReviewDTO;
import com.example.soapexample.soap.ReviewSoap;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReviewMapper implements Mapper<ReviewSoap, ReviewDTO> {

    private final ModelMapper modelMapper;

    @Override
    public ReviewSoap toSoap(ReviewDTO reviewDTO) {
        return modelMapper.map(reviewDTO, ReviewSoap.class);
    }

    @Override
    public ReviewDTO toDto(ReviewSoap reviewSoap) {
        return modelMapper.map(reviewSoap, ReviewDTO.class);
    }
}

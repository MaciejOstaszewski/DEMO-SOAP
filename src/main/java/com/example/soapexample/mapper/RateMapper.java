package com.example.soapexample.mapper;

import com.example.soapexample.dto.RateDTO;
import com.example.soapexample.soap.RateSoap;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RateMapper implements Mapper<RateSoap, RateDTO> {

    private final ModelMapper modelMapper;

    @Override
    public RateSoap toSoap(RateDTO rateDTO) {
        return modelMapper.map(rateDTO, RateSoap.class);
    }

    @Override
    public RateDTO toDto(RateSoap rateSoap) {
        return modelMapper.map(rateSoap, RateDTO.class);
    }
}

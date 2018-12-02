package com.example.soapexample.mapper;

import java.util.List;
import java.util.stream.Collectors;

interface Mapper<SOAP extends Object, DTO extends Object>{

    SOAP toSoap(DTO dto);

    DTO toDto(SOAP soap);

    default List<SOAP> toSoaps(List<DTO> dtos) {
        return dtos.stream().map(this::toSoap).collect(Collectors.toList());
    }
    default List<DTO> toDtos(List<SOAP> entities){
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }
}

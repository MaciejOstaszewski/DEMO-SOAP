package com.example.soapexample.modelMapper;

import com.example.soapexample.dto.MovieDTO;
import com.example.soapexample.soap.MovieSoap;
import lombok.RequiredArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.time.LocalDate;
import java.util.GregorianCalendar;

@RequiredArgsConstructor
public class MovieMapping {
    private final ModelMapper modelMapper;

    public void addMovieMapping() {
        addMovieTimeMapping();
    }

    private void addMovieTimeMapping() {
        Converter<XMLGregorianCalendar, LocalDate> toLocalDateFromXmlGregorianCalendar =
                source -> XMLGregorianCalendarToLocalDate(source.getSource());

        modelMapper.typeMap(MovieSoap.class, MovieDTO.class)
                .addMappings(
                        mapper -> mapper.using(toLocalDateFromXmlGregorianCalendar).map(MovieSoap::getReleaseDate, MovieDTO::setReleaseDate)
                );
        Converter<LocalDate, XMLGregorianCalendar> toGregorianCalendarFromLocalDate =
                source -> localDateToXMLGregorianCalendar(source.getSource());

        modelMapper.typeMap(MovieDTO.class, MovieSoap.class)
                .addMappings(
                        mapper -> mapper.using(toGregorianCalendarFromLocalDate).map(MovieDTO::getReleaseDate, MovieSoap::setReleaseDate)
                );

        Converter<XMLGregorianCalendar, Instant> toInstantFromXmlGregorianCalendar =
                source -> XMLGregorianCalendarToInstant(source.getSource());

        modelMapper.typeMap(MovieSoap.class, MovieDTO.class)
                .addMappings(
                        mapper -> mapper.using(toInstantFromXmlGregorianCalendar).map(MovieSoap::getCreationDate, MovieDTO::setCreationDate)
                );

        Converter<Instant, XMLGregorianCalendar> toGregorianCalendarFromInstant =
                source -> instantToXMLGregorianCalendar(source.getSource());

        modelMapper.typeMap(MovieDTO.class, MovieSoap.class)
                .addMappings(
                        mapper -> mapper.using(toGregorianCalendarFromInstant).map(MovieDTO::getCreationDate, MovieSoap::setCreationDate)
                );

    }

    private XMLGregorianCalendar localDateToXMLGregorianCalendar(LocalDate localDate) {
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(localDate.toString());
        } catch (DatatypeConfigurationException e) {
            return null;
        }
    }

    private LocalDate XMLGregorianCalendarToLocalDate(XMLGregorianCalendar xmlGregorianCalendar) {
        return xmlGregorianCalendar.toGregorianCalendar().toZonedDateTime().toLocalDate();
    }

    private XMLGregorianCalendar instantToXMLGregorianCalendar(Instant instant) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(instant.toEpochMilli());
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (DatatypeConfigurationException e) {
            return null;
        }
    }

    private Instant XMLGregorianCalendarToInstant(XMLGregorianCalendar xmlGregorianCalendar) {
        return xmlGregorianCalendar.toGregorianCalendar().toZonedDateTime().toInstant();
    }

}

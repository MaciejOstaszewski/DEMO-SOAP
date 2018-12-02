package com.example.soapexample.endpoint;

import com.example.soapexample.soap.*;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.servlet.http.HttpServletRequest;

@Endpoint
@RequiredArgsConstructor
public class MovieEndpoint {


    private static final String NAMESPACE_URI = "http://example.com.soapexample/soap";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createMovieRequest")
    @ResponsePayload
    public CreateMovieResponse createMovie(@RequestPayload CreateMovieRequest request) {

        CreateMovieResponse response = new CreateMovieResponse();
        response.setMovie(request.getMovie());

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateMovieRequest")
    @ResponsePayload
    public UpdateMovieResponse updateMovie(@RequestPayload UpdateMovieRequest request) {

        UpdateMovieResponse response = new UpdateMovieResponse();
        response.setMovie(request.getMovie());


        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteMovieRequest")
    @ResponsePayload
    public DeleteMovieResponse deleteMovie(@RequestPayload DeleteMovieRequest request) {

        DeleteMovieResponse response = new DeleteMovieResponse();
        response.setMovieId(request.getMovieId());


        return response;
    }
}

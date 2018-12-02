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
public class RateEndpoint {

    private static final String NAMESPACE_URI = "http://example.com.soapexample/soap";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createRateRequest")
    @ResponsePayload
    public CreateRateResponse createRate(@RequestPayload CreateRateRequest request) {

        CreateRateResponse response = new CreateRateResponse();
        response.setRate(request.getRate());

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateRateRequest")
    @ResponsePayload
    public UpdateRateResponse updateRate(@RequestPayload UpdateRateRequest request) {

        UpdateRateResponse response = new UpdateRateResponse();
        response.setRate(request.getRate());



        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteRateRequest")
    @ResponsePayload
    public DeleteRateResponse deleteRate(@RequestPayload DeleteRateRequest request) {

        DeleteRateResponse response = new DeleteRateResponse();
        response.setRateId(request.getRateId());


        return response;
    }

}

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
public class ReviewEndpoint {

    private static final String NAMESPACE_URI = "http://example.com.soapexample/soap";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createReviewRequest")
    @ResponsePayload
    public CreateReviewResponse createReview(@RequestPayload CreateReviewRequest request) {

        CreateReviewResponse response = new CreateReviewResponse();

        response.setReview(request.getReview());

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateReviewRequest")
    @ResponsePayload
    public UpdateReviewResponse updateReview(@RequestPayload UpdateReviewRequest request) {

        UpdateReviewResponse response = new UpdateReviewResponse();
        response.setReview(request.getReview());

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteReviewRequest")
    @ResponsePayload
    public DeleteReviewResponse deleteReview(@RequestPayload DeleteReviewRequest request) {

        DeleteReviewResponse response = new DeleteReviewResponse();

        response.setReviewId(request.getReviewId());
        return response;
    }

}

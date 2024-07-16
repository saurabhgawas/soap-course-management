package com.springboot.soap;

import com.springboot.courses.CourseDetails;
import com.springboot.courses.GetCourseDetailsRequest;
import com.springboot.courses.GetCourseDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndpoint {

    //method which takes input as a request object(GetCourseDetailsRequest) and generates a output using response object(GetCourseDetailssponseRe)
    @PayloadRoot(namespace = "http://springboot.com/courses" ,localPart="GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request){
        GetCourseDetailsResponse response = new GetCourseDetailsResponse();
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(request.getId());
        courseDetails.setName("Microservices Course");
        courseDetails.setDescription("Very Good Course");
        response.setCourseDetails(courseDetails);
        return response;
    }

}

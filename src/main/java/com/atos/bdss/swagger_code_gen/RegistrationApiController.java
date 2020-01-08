package com.atos.bdss.swagger_code_gen;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.api.RegistrationApi;
import io.swagger.model.MemberDetails;
import io.swagger.model.Success;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
@Controller
public class RegistrationApiController implements RegistrationApi {

    private static final Logger log = LoggerFactory.getLogger(RegistrationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public RegistrationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Success> registerMember(@ApiParam(value = "The details of the new member to be registered."  )  @Valid @RequestBody MemberDetails memberDetails) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Success>(objectMapper.readValue("{  \"memberID\" : \"1234A\"}", Success.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Success>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Success>(HttpStatus.NOT_IMPLEMENTED);
    }

}

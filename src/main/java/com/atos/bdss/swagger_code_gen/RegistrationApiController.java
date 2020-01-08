package com.atos.bdss.swagger_code_gen;

import org.springframework.stereotype.Controller;
@Controller
public class RegistrationApiController { //implements RegistrationApi {
//
//    private static final Logger log = LoggerFactory.getLogger(RegistrationApiController.class);
//
//    private final ObjectMapper objectMapper;
//
//    private final HttpServletRequest request;
//
//    @Autowired
//    public RegistrationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
//        this.objectMapper = objectMapper;
//        this.request = request;
//    }
//
//    public ResponseEntity<Success> registerMember(@ApiParam(value = "The details of the new member to be registered."  )  @Valid @RequestBody MemberDetails memberDetails) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<Success>(objectMapper.readValue("{  \"memberID\" : \"1234A\"}", Success.class), HttpStatus.OK);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Success>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<Success>(HttpStatus.NOT_IMPLEMENTED);
//    }

}

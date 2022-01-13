package app;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.*;
import java.io.PrintStream;

@RestController
class WebController {
    private static final Logger log = LoggerFactory.getLogger(WebController.class);


    @GetMapping("/hello")
    public Response Sample() {
        Response response = new Response();
        response.message("Witaj");
        response.getName();
        return response;


    }



    @GetMapping(value = "/name" )
    public Response Sample2() {

        Response response = new Response();
        response.getName();
        response.message("Type command like this {\"name\": \"newname\"} to send changename post");
        return response;
    }


    @PostMapping(value = "/name" )

    //komenda do zmiany nazwy	{"name": "newname"}

    public Response Test(@RequestBody Request inputPayload) {
        Response response = new Response();
        response.setName("Hello " + inputPayload.getName());
        return response;
    }
}
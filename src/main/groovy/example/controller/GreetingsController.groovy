package example.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/greetings")
class GreetingsController {

    @Get
    String hello() {
        "Hello! How are you?"
    }

}

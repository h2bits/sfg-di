package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/*
 * The preferred method for DI is constructor injection.
 * It provides a cleaner implementation, using a private final property.
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // @Autowired is optional here
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

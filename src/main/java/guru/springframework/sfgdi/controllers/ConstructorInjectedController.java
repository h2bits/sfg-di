package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*
 * The preferred method for DI is constructor injection.
 * It provides a cleaner implementation, using a private final property.
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // @Autowired is optional here
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

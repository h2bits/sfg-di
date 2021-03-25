package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/*
 * The preferred method for DI is constructor injection.
 * It provides a cleaner implementation, using a private final property.
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

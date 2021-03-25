package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/*
 * Property injection is the least preferred method of DI. Avoid it!
 * As a private property is a problem for testing, we end up using a public one.
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

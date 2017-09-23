/* Created by murugan_nagarajan on 9/19/2017 */
package tamil.learn.springframework.learnspringdi.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tamil.learn.springframework.learnspringdi.services.GreetingServiceImpl;

public class SetterInjectControllerTest {

    private SetterInjectController setterInjectController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectController = new SetterInjectController();
        this.setterInjectController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals("The Greeting Service is injected",
                GreetingServiceImpl.HELLO_TEAM, setterInjectController.sayHello());
    }
}

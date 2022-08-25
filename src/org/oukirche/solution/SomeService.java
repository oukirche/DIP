package org.oukirche.solution;

public class SomeService {
    Logger logger;

    //Injection
    public SomeService(Logger logger) {
        this.logger = logger;
    }

    public void someMethod(){
        logger.log("hi");
    }
}

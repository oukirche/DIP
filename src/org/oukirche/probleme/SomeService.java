package org.oukirche.probleme;

public class SomeService {
    private Logger logger;

    public SomeService(Logger logger) {
        this.logger = logger;
    }

    public void someMethod(){
        logger.log("hi");
    }
}

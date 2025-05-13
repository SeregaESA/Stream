package patterns.chainOfResponsibility;

import patterns.chainOfResponsibility.handlers.AppleHandler;
import patterns.chainOfResponsibility.handlers.BananaHandler;
import patterns.chainOfResponsibility.handlers.Handler;
import patterns.chainOfResponsibility.handlers.OrangeHandler;

public class Test {
    public static void main(String[] args) {

        Handler appleHandler = new AppleHandler();
        Handler orangeHandler = new OrangeHandler();
        Handler bananaHandler = new BananaHandler();

        appleHandler.setNextHandler(orangeHandler).setNextHandler(bananaHandler);

        appleHandler.handleRequest(Fruit.Mango);

    }
}

package patterns.chainOfResponsibility.handlers;

import patterns.chainOfResponsibility.Fruit;

public class AppleHandler extends Handler {
    @Override
    protected boolean canHandle(Fruit fruit) {
        return fruit == Fruit.Apple;
    }

    @Override
    protected void processRequest() {
        System.out.println("Готовим яблочный пирог");
    }
}

package patterns.chainOfResponsibility.handlers;

import patterns.chainOfResponsibility.Fruit;

public class OrangeHandler extends Handler {
    @Override
    protected boolean canHandle(Fruit fruit) {
        return fruit == Fruit.Orange;
    }

    @Override
    protected void processRequest() {
        System.out.println("Готовим апельсиновый сок");
    }
}

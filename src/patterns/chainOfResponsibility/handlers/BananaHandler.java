package patterns.chainOfResponsibility.handlers;

import patterns.chainOfResponsibility.Fruit;

public class BananaHandler extends Handler {
    @Override
    protected boolean canHandle(Fruit fruit) {
        return fruit == Fruit.Banana;
    }

    @Override
    protected void processRequest() {
        System.out.println("Готовим банановый смузи");
    }
}

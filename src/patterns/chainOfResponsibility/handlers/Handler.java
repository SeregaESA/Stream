package patterns.chainOfResponsibility.handlers;

import patterns.chainOfResponsibility.Fruit;

public abstract class Handler {

    private Handler nextHandler;

    public final Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public final void handleRequest(Fruit fruit) {
        if(canHandle(fruit)) {
            processRequest();
        } else if(nextHandler != null) {
            nextHandler.handleRequest(fruit);
        } else {
            System.out.println("Запрос не может быть обработан");
        }
    }

    protected abstract boolean canHandle(Fruit fruit);
    protected abstract void processRequest();

}

package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {

    // Exchanger позволяет обмениваться данными между двумя потоками. Когда один передал информацию, он блокируется
    // и ждёт информацию от другого. Когда второй передаст информацию, первый разблокируется
    // потоки получат их одновременно.

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNICI);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);

        new BestFriend("Сергей", exchanger, friend1Action);
        new BestFriend("Натали", exchanger, friend2Action);

    }
}

enum Action {
    KAMEN, NOJNICI, BUMAGA;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> actions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, Exchanger<Action> exchanger, List<Action> actions) {
        this.name = name;
        this.exchanger = exchanger;
        this.actions = actions;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        if (myAction == Action.KAMEN && friendAction == Action.NOJNICI
        || myAction == Action.NOJNICI && friendAction == Action.BUMAGA
        || myAction == Action.BUMAGA && friendAction == Action.KAMEN) {
            System.out.println(name + " выйграл");
        }
    }

    public void run() {
        Action replay;
        for (Action action : actions) {
            try {
                replay = exchanger.exchange(action); // Передаём своё действие в Exchanger и ждём, пока друг передаст своё
                whoWins(action, replay);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
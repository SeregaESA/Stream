package multithreading.synchronizedPack;

public class SynchronizedObject {
    // Создаётся объект на котором будет происходить синхронизация (заниматься маниторинг).
    // Может быть объект любого класса.
    private static final Object block = new Object();

    void mobileCall() {
        synchronized (block) {
            System.out.println("Мобильный звонок начался");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Мобильный звонок закончался");
        }
    }

    void skypeCall() {
        synchronized (block) {
            System.out.println("Скайп звонок начался");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Скайп звонок закончался");
        }
    }

    void whatsappCall() {
        synchronized (block) {
            System.out.println("Ватцап звонок начался");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ватцап звонок закончался");
        }
    }

    public static void main(String[] args) {
        Thread threadMobile = new Thread(new RunnableMobileImpl());
        Thread threadSkype = new Thread(new RunnableSkypeImpl());
        Thread threadWhatsapp = new Thread(new RunnableWhatsappImpl());
        threadMobile.start();
        threadSkype.start();
        threadWhatsapp.start();

    }
}

class RunnableMobileImpl implements Runnable {
    @Override
    public void run() {
        new SynchronizedObject().mobileCall();
    }
}

class RunnableSkypeImpl implements Runnable {
    @Override
    public void run() {
        new SynchronizedObject().skypeCall();
    }
}

class RunnableWhatsappImpl implements Runnable {
    @Override
    public void run() {
        new SynchronizedObject().whatsappCall();
    }
}


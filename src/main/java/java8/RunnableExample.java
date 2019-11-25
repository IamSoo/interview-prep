package java8;

public class RunnableExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running the thread");
            }
        });

        //thread.run();

        Thread lamdbaTh = new Thread(() -> System.out.println("Lambda Runnable"));
        lamdbaTh.run();
    }

}

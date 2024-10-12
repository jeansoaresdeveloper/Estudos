package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        /**
         * Prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         * Java 8 Lambda () -> {}
         */

        Runnable runnableLambda = () -> System.out.println("Lambda Runnable 1");

        new Thread(runnableLambda).start();

    }

}

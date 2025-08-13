package Threads;

class ExampleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Executando na thread: " + Thread.currentThread().getName());
    }
    
    public class Main {
        public static void main(String[] args) {
            Thread t1 = new ExampleThread();
            t1.start(); // start() cria nova thread e executa run()
        }
}


}

public class MultipleThreads extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        MultipleThreads t1 = new MultipleThreads();
        MultipleThreads t2 = new MultipleThreads();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
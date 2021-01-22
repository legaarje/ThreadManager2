public class Counter2 {

    int count;

    public synchronized void increment() {
        count++;
    }
}


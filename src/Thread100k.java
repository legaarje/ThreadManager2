public class Thread100k extends Thread {

    public static void main(String[] args) throws Exception {
        Counter2 c = new Counter2();
        Counter counter = new Counter();


        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });


        Thread t3 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });

        Thread t5 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });

        Thread t6 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });

        Thread t7 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });

        Thread t8 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });

        Thread t9 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });

        Thread t10 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<100000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();

        System.out.println("Count " + c.count);

    }
}


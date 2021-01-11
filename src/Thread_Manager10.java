public class Thread_Manager10 extends Thread{

    public static int counter = 0;
    private String number;


    public static void main(String[] args) {

        Thread_Manager10 thread1 = new Thread_Manager10("1");
        Thread_Manager10 thread2 = new Thread_Manager10("2");
        Thread_Manager10 thread3 = new Thread_Manager10("3");
        Thread_Manager10 thread4 = new Thread_Manager10("4");
        Thread_Manager10 thread5 = new Thread_Manager10("5");
        Thread_Manager10 thread6 = new Thread_Manager10("6");
        Thread_Manager10 thread7 = new Thread_Manager10("7");
        Thread_Manager10 thread8 = new Thread_Manager10("8");
        Thread_Manager10 thread9 = new Thread_Manager10("9");
        Thread_Manager10 thread10 = new Thread_Manager10("10");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

        System.out.println("*** the end ***");
        System.out.println("Counter: " + counter.);
    }

    public Thread_Manager10(String s) { number = s;}

    public void myPrint(char c)
    {
        System.out.print(c);
    }


    public void run()
    {
        char c;
        int stop = number.length();
        for (int i = 0; i < stop ; i++)
        {
            myPrint(number.charAt(i));
        }
    }










}

import java.io.*;
import java.net.*;
import java.util.*;

public class Thread_Manager2 extends Thread
{
    private String what = "dummy";
    private int myNumber = 0;

    public Thread_Manager2(String input, int i)
    {
        this.what = input;
        this.myNumber = i;
        System.out.println("Thread " + myNumber + ": ********************************************************************");
        System.out.println("Thread " + myNumber + ": OK, we are constructing one Thread_demo object.");
    }


    public static void main(String[] args)
    {
        System.out.println("OK, we are starting the mother tread: Thread_Manager.");

        String what = "bla bla";
        int nr = 1;

        Thread t1 = new Thread_Manager2(what, nr);
        System.out.println("Mother-thread: Trying to start first thread.");
        t1.start();

        what = "hum hum";
        nr = nr +1;

        Thread t2 = new Thread_Manager2(what, nr);
        System.out.println("Mother-thread: Trying to start second thread.");
        t2.start();

        System.out.println("OK, the mother thread is running the last command.");
    }


    public void run()
    {
        System.out.println("Thread " + myNumber + ": ********************************************************************");
        System.out.println("Thread " + myNumber + ": OK, we are starting one ServerThread.");

        Random rnd = new Random();
        int delay;

        while(true)
        {
            delay = 200 + rnd.nextInt(500);
            try
            {
                Thread.sleep(delay);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread " + myNumber + ": CRAP, I AM DEAD");
            }

            if (what.equals("hum hum"))
            {
                System.out.println("Thread " + myNumber + ": " + rnd.nextInt());
            }
            else
            {
                System.out.println("Thread " + myNumber + ": " + what);
            }


        }
    }

}

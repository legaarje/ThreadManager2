public class CAOS_thread_demo_4 extends Thread
{
    public static int counter = 0;
    private String myBla;

    public static void main(String[] args)
    {

        CAOS_thread_demo_4 humhum1 = new CAOS_thread_demo_4("Sverige er et dejligt land, og flaggan är vacker med blå og gula färger.");
        CAOS_thread_demo_4 humhum2 = new CAOS_thread_demo_4("Vi er røde vi er hvide, vi er røde vi er hvide, vi er røde vi er hvide.");
        CAOS_thread_demo_4 humhum3 = new CAOS_thread_demo_4("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        CAOS_thread_demo_4 humhum4 = new CAOS_thread_demo_4("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        CAOS_thread_demo_4 humhum5 = new CAOS_thread_demo_4("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        CAOS_thread_demo_4 humhum6 = new CAOS_thread_demo_4("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        CAOS_thread_demo_4 humhum7 = new CAOS_thread_demo_4("God save the queen. Hello old chap, how are you doing in this terrible heat?");
        CAOS_thread_demo_4 humhum8 = new CAOS_thread_demo_4("I'm a Texas cowboy shooting my gun all day, chasing caos, and drinking crappy coffe.");
        humhum1.start();
        humhum2.start();
        humhum3.start();
        humhum4.start();
        humhum5.start();
        humhum6.start();
        humhum7.start();
        humhum8.start();

/*
		try
		{
	      	humhum1.join();
    	  	humhum2.join();
      		humhum3.join();
	      	humhum4.join();
    	  	humhum5.join();
      		humhum6.join();
	      	humhum7.join();
    	  	humhum8.join();
		}
		catch(Exception e)
		{}
*/

        System.out.println("*** the end ***");
        //her havde kristoffer en counter: System.out.println("counter number: " +counter());
        //10 tråde som bruger den samme metode og opdatere samme variabel
        //forventer race risk

    }

    public CAOS_thread_demo_4(String s)
    {
        myBla = s;
    }

    public void myStupidPrint(char c)
    {
        System.out.print(c);
    }

    public void run()
    {
        char c;
        int stop = myBla.length();
        for (int i = 0; i < stop ; i++)
        {
            myStupidPrint(myBla.charAt(i));
        }
    }

}

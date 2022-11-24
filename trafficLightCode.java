import java.util.Scanner;

class HelloWorld {

    public static void trafficLight(int rt, int yt, int gt) {

        System.out.println(" !!! RED Light !!! ");
        System.out.println("Please STOP & wait!");
        long startTime1 = System.currentTimeMillis();
        long endTime1 = startTime1 + rt * 1000;
        while (System.currentTimeMillis() < endTime1) {
        }

        System.out.println(" !!! YELLOW Light !!! ");
        System.out.println("Start your vehicles & Get Ready!");
        long startTime2 = System.currentTimeMillis();
        long endTime2 = startTime2 + yt * 1000;
        while (System.currentTimeMillis() < endTime2) {
        }

        System.out.println(" !!! Green Light !!! ");
        System.out.println("Go!!");
        long startTime3 = System.currentTimeMillis();
        long endTime3 = startTime3 + gt * 1000;
        while (System.currentTimeMillis() < endTime3) {
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Plese enter 1 to start the traffic lights:");
        int t;

        do {
            t = scn.nextInt();
            if (t == 1) {
                System.out.println("Plese enter the total seconds for which you want to switch on the Traffic lights:"); //Time interval of lights can be varied, currently for viewing purpose it is set in seconds.
                System.out.println("Plese enter the time limit for Red light in Seconds:");
                int rt = scn.nextInt();

                System.out.println("Plese enter the time limit for Yellow light in Seconds:");
                int yt = scn.nextInt();

                System.out.println("Plese enter the time limit for Green light in Seconds:");
                int gt = scn.nextInt();

                long startTime0 = System.currentTimeMillis();
                long endTime0 = startTime0 + tSec * 1000;
                while (System.currentTimeMillis() < endTime0) {
                    trafficLight(rt, yt, gt);
                }
            } else {
                System.out.println("You are pressing the wrong key, Plese press 1 to start the lights.");
            }
        } while (t != 1);

    }

}

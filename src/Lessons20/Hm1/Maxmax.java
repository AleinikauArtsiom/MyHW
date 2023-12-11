package Lessons20.Hm1;

public class Maxmax implements Runnable {
    public void run(){
    for(int i =0; Main.array.length>i; i++){
        synchronized (Main.class) {
            if (Main.array[i] > Main.max) {
                Main.max = Main.array[i];
            }
        }
    }
        System.out.println("MAX --> " + Main.max);

    }

}

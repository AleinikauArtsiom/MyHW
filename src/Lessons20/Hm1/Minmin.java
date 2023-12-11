package Lessons20.Hm1;

public class Minmin implements Runnable{
    public void run(){
        for(int i =0; Main.array.length>i; i++){
            synchronized (Main.class) {
                if (Main.array[i] < Main.min) {
                    Main.min = Main.array[i];

                }
            }
        }

    }

}

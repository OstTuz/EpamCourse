package Threads;

import java.util.concurrent.TimeUnit;

public class AirportOptional implements Runnable {
    @Override
    public void run() {
        System.out.println("Lane took the plane - " + Thread.currentThread().getName());
        System.out.println("Plane is going to go out on the lane - " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Plane departed - " + Thread.currentThread().getName());
        System.out.println("Lane is free - " + Thread.currentThread().getName());

    }
}

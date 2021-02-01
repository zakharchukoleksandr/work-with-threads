package ua.mainacademy.servis;

import java.util.logging.Logger;

public class TreadService extends Thread {

//public class TreadService implements Runnable {

    public static final Logger LOGGER = Logger.getLogger(TreadService.class.getName());

    private int counter;
    private int num1;
    private int num2;

    public TreadService(int counter, int num1, int num2) {
        this.counter = counter;
        this.num1 = num1;
        this.num2 = num2;

    }

    public int getMultiResult(int num1, int num2) {
        return num1 * num2;
    }

   /* @Override
    public void run() {        //for Thread
        super.run();
    }*/


    @Override
    public void run() {    //for Runnable
        LOGGER.info("Result is "+getMultiResult(num1, num2)+", thread is - "+counter);
    }
}

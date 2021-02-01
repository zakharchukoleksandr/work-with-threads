package ua.mainacademy;


import ua.mainacademy.servis.TreadService;

import java.util.logging.Logger;

public class AppRunner {

    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());


    public static void main(String[] args) {

        int counter = 1;
        for (int i = 200; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                Thread thread = new TreadService(counter, i, j);
                thread.start();
                counter++;
                LOGGER.info("Thread status is "+thread.getState().name());

            }

        }

    }

}

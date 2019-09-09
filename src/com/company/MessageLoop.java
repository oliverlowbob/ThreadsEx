package com.company;

import static com.company.SimpleThreads.threadMessage;

public class MessageLoop
        implements Runnable {
    public void run() {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        try {
            for (int i = 0;
                 i < importantInfo.length;
                 i++) {
                // Pause for 4 seconds
                Thread.sleep(4000);
                // Print a message
                threadMessage(importantInfo[i]);
            }
        } catch (InterruptedException e) {
            threadMessage("I wasn't done!");
        }
    }
}
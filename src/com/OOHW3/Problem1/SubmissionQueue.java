package com.OOHW3.Problem1;

import java.util.LinkedList;
import java.util.Queue;

public class SubmissionQueue {
    // Actual FIFO queue to store submissions
    private static Queue<Submission> queue = new LinkedList<Submission>();

    // Singleton
    private SubmissionQueue() {}
    private static SubmissionQueue queueInstance = null;
    public static SubmissionQueue getSubmissionQueue() {
        // If we really want to be correct I think we have to do some java magic here to allow multithreading.
        if (queueInstance == null){
            queueInstance = new SubmissionQueue();
        }
        return queueInstance;
    }

    public void add(Submission s){
        queue.add(s);
        System.out.println("Added submission to queue: " + s);
    }

    public Submission process(){
        // Get next element
        Submission s = queue.poll();
        if(s == null){
            System.out.println("Queue empty, nothing removed.");
        } else {
            System.out.println("Removed from queue: " + s);
        }
        return s;
    }
}

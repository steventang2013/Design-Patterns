/**
 * Submission.java
 *
 * A basic dummy Submission object for use with the auto-grader
 */
package com.OOHW3.Problem1;
import java.util.Random;

public class Submission {
    private static Random rand = new Random();
    private int id;


    public Submission() {
        // Give this submission a unique(ish) id
        id = rand.nextInt(10000000);
    }

    public String toString(){
        // Cleaner printing for debugging
        return "Submission with id " + this.id;
    }
}
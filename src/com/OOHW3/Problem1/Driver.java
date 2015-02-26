package com.OOHW3.Problem1;

public class Driver {

    public static void main(String[] args) {
        SubmissionQueue sq = SubmissionQueue.getSubmissionQueue();

        Submission[] submissionArray;
        submissionArray = new Submission[5];
        for(int i = 0 ; i < 5 ; i++){
            submissionArray[i] = new Submission();
        }

        for(Submission submission : submissionArray){
            sq.add(submission);
        }

        // Should equal first submission
        sq.process();

        // Get new submission queue, should return the same instance
        SubmissionQueue sq2 = SubmissionQueue.getSubmissionQueue();

        // Should be second submission
        sq2.process();

        // Should be third submission
        sq.process();
        sq.process();
        sq.process();
        sq2.process();
    }
}

/*
 *  Problem #1 Auto-grader Submission Management
 *  Singleton design pattern.
 *  Proved by both using the static methods and creating
 *  SubmissionQueue objects which end up pointing to
 *  the same singleton class
 * */
public class Driver {
    public static void main(String[] args) {

        System.out.println("\nQueue instantiated to prove both point to the singleton");
        SubmissionQueue queue1 = SubmissionQueue.getSubmissionQueue();

        //Build array of submission objects
        Submission[] submissionArr;
        submissionArr = new Submission[4];
        for(int i = 0 ; i < 4 ; i++){
            submissionArr[i] = new Submission();
        }

        //Enqueu with both static method and initialized object
        for(int i=0; i<3; i=i+2){
          SubmissionQueue.add(submissionArr[i]);
          System.out.println("");
          queue1.add(submissionArr[i+1]);
        }

        System.out.println("");
        //First submission
        SubmissionQueue.process();

        //Second submission
        queue1.process();

        //Third submission
        SubmissionQueue.process();

        //Fourth submission
        queue1.process();

        //No more to remove
        System.out.println("");
        SubmissionQueue.process();
        queue1.process();
    }
}

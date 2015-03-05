import java.util.LinkedList;
import java.util.Queue;

public class SubmissionQueue {
  //Native Java FIFO queue for submission storing
  private static Queue<Submission> nativeQueue;
  private static SubmissionQueue mySubmissionQueue;

  //New SubmissionQueue Constructor
  private SubmissionQueue() {
    //Create new Java native Queue
    nativeQueue = new LinkedList<Submission>();
  }

  public static SubmissionQueue getSubmissionQueue() {
    if (mySubmissionQueue == null){
        //create new SubmissionQueue
        mySubmissionQueue = new SubmissionQueue();
    }
      return mySubmissionQueue;
  }

  public static void add(Submission s){
    //Enqueue Submission element
    getSubmissionQueue().nativeQueue.add(s);
    System.out.println("Added submission of value " + s + " to queue");
  }

  public static Submission process(){
    //Dequeu first Submission element
    Submission s = getSubmissionQueue().nativeQueue.poll();
    if(s == null){
        System.out.println("Queue empty, nothing removed.");
    }
    else {
        System.out.println("Removed " + s + " from queue");
    }
    //Return submission
    return s;
  }
}

package collections;

import java.util.LinkedList;
import java.util.Queue;

//Queue

public class PrintQueue {
    public static void main(String[] args) {
        Queue<String> printJobs = new LinkedList<>();
        printJobs.add("Document1");
        printJobs.add("Document2");
        printJobs.add("Document3");

        System.out.println("Print Queue: " + printJobs);
        System.out.println("Processing: " + printJobs.poll());
        System.out.println("Remaining Queue: " + printJobs);
    }
}

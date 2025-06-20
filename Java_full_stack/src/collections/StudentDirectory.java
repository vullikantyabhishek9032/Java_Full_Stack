package collections;

import java.util.HashMap;

//HashMap

public class StudentDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(212, "Suresh");
        students.put(826, "Vishnu");
        students.put(296, "Kishore");
        students.put(512, "Harsha");

        System.out.println("Student Directory: " + students);
        System.out.println("Student with ID 296: " + students.get(296));
    }
}

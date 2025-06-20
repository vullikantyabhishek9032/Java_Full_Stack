package collections;

import java.util.HashSet;

//HashSet

public class UniqueUsernames {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();
        usernames.add("aravind");
        usernames.add("vinod");
        usernames.add("aravind"); // Duplicate

        System.out.println("Unique Usernames: " + usernames);
    }
}

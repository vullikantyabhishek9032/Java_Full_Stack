package collections;

import java.util.ArrayList;

public class Collection_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Arjun");
        names.add("Bobby");
        names.add("Charan");

        // Displaying elements
        System.out.println("Names: " + names);

        // Removing an element
        names.remove("Bobby");

        // Displaying updated list
        System.out.println("Updated Names: " + names);
    }
}

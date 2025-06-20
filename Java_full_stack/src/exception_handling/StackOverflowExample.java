package exception_handling;

public class StackOverflowExample {
	
	//ERROR Exectpion 
	
    public static void recursiveMethod() {
        // No base condition — leads to infinite recursion
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Error: Stack overflow occurred due to infinite recursion.");
        }

        System.out.println("Program continues after handling the error.");
    }
}

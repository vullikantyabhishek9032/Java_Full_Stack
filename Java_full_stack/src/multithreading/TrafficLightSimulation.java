package multithreading;

//Thread.sleep()

public class TrafficLightSimulation {
    public static void main(String[] args) {
        String[] lights = {"Red", "Green", "Yellow"};
        int[] durations = {3000, 5000, 2000}; // durations in milliseconds

        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light: " + lights[i]);
            try {
                Thread.sleep(durations[i]); // Pause for the duration of the light
            } catch (InterruptedException e) {
                System.out.println("Simulation interrupted.");
            }
        }

        System.out.println("Traffic light cycle completed.");
    }
}

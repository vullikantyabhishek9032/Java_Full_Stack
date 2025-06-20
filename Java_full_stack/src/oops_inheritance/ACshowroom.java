package oops_inheritance;

//Inheritance
//Multilevel Inheritance


//Base class
class Appliance {
 void powerOn() {
     System.out.println("Appliance is powered on.");
 }
}

//Intermediate class
class SmartAppliance extends Appliance {
 void connectToWiFi() {
     System.out.println("Smart appliance connected to WiFi.");
 }
}

//Interface 1
interface Controllable {
 void control();
}

//Interface 2
interface Monitorable {
 void monitor();
}

//Final class using hybrid inheritance
class SmartAC extends SmartAppliance implements Controllable, Monitorable {
 public void control() {
     System.out.println("Smart AC temperature is being controlled remotely.");
 }

 public void monitor() {
     System.out.println("Smart AC energy usage is being monitored.");
 }

 void setTemperature(int temp) {
     System.out.println("Temperature set to " + temp + "°C.");
 }
}

//Main class
public class ACshowroom {
 public static void main(String[] args) {
     SmartAC ac = new SmartAC();
     ac.powerOn();         // From Appliance
     ac.connectToWiFi();   // From SmartAppliance
     ac.control();         // From Controllable
     ac.monitor();         // From Monitorable
     ac.setTemperature(24); // From SmartAC
 }
}

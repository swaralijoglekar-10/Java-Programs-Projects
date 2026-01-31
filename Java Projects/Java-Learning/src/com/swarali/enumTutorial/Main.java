package com.swarali.enumTutorial;
import static com.swarali.enumTutorial.Car.TrafficLight;

public class Main {
    public static void main(String[] args) {
        Car car1= new Car("VW", 2001);

        // car1.drive("Magenta"); //I'll get exception from Car.java

        // car1.drive(Car.TrafficLight.YELLOW);

        car1.drive(TrafficLight.YELLOW);

        //passing arguments to String[] args before running the code
        System.out.println(args.length);
        for(String s: args) System.out.println(s);

    }
}


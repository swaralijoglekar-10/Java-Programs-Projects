package com.swarali.enumTutorial;

public class Car{

    String brand;
    int launchYear;
    public enum TrafficLight {RED, GREEN, YELLOW}; //enum

    public Car(String brand, int launchYear) {
        this.brand = brand;
        this.launchYear = launchYear;
    }

//    public void drive(String trafficLight){
//        if(!trafficLight.equals("RED") && !trafficLight.equals("GREEN") && !trafficLight.equals("YELLOW")){
//        throw new IllegalArgumentException("light should be red or green or yellow");
//        }
//        switch(trafficLight){
//            case "RED":
//                System.out.println("Stop");
//                  break;
//            case "GREEN":
//                System.out.println("Go");
//                break;
//            case "YELLOW":
//                System.out.println("Slow down");
//                break;
//        }
//    }

    public void drive(TrafficLight trafficLight){
        if(trafficLight == null) throw new IllegalArgumentException("light should be red or green or yellow");

        switch(trafficLight){
            case RED:
                System.out.println("Stop");
                break;

            case GREEN:
                System.out.println("Go");
                break;

            case YELLOW:
                System.out.println("Slow down");
                break;
        }

    }

}
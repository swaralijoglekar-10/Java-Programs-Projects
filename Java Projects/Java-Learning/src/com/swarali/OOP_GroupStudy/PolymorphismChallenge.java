package com.swarali.OOP_GroupStudy;

class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class Main1 {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}

//
//public class PolymorphismChallenge {
//    public static void main(String[] args) {
//        Car car = new GasPoweredCar(20, 4);
//        car.startEngine();
//        car.drive();
//    }
//}
//
//class Car{
//    private String description;
//
//    public Car(){
//    }
//    public Car(String description){
//        this.description= description;
//    }
//    public void startEngine(){
//        System.out.println("start car");
//    }
//    public void drive(){
//        System.out.println("drive car");
//        runEngine();
//    }
//    protected void runEngine(){
//        System.out.println("run car engine");
//    }
//}
//
//class GasPoweredCar extends Car{
//    private double avgkmPerLitre;
//    private int cylinders;
//
//    public GasPoweredCar(double avg, int cylinders){
//        this.avgkmPerLitre=avg;
//        this.cylinders=cylinders;
//    }
//    @Override
//    public void startEngine(){
//        System.out.println("start gas powered car");
//        System.out.println("It has "+cylinders+" cylinders");
//    }
//
//    @Override
//    public void drive(){
//        System.out.println("drive gas powered car");
//        System.out.println("Its average is "+avgkmPerLitre);
//    }
//}

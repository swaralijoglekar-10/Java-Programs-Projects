package com.swarali.OOP_GroupStudy;

public record Circle(double radius) {

    public double getArea(){
       return Math.PI*Math.pow(radius(), 2);
    }

    public static void main(String[] args) {
        Circle circle= new Circle(23.45);
        System.out.println("Circle's radius= "+circle.radius() +
                "\nCircle's area= "+circle.getArea());
    }
}

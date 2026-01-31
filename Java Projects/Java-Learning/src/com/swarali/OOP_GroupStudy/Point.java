package com.swarali.OOP_GroupStudy;

import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point(){
        System.out.println("Point class--Default constructor");
    }

    public Point(int x, int y){
        this.x= x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        Point newPoint= new Point(0,0);
        double distance = sqrt((this.y- newPoint.y)*(this.y- newPoint.y) + (this.x- newPoint.x)*(this.x- newPoint.x));
        return distance;
    }
    public double distance(Point point){
        double distance = sqrt((this.y- point.y)*(this.y- point.y) + (this.x- point.x)*(this.x- point.x));
        return distance;
    }

    public double distance(int x, int y){
        double distance = sqrt((this.y- y)*(this.y- y) + (this.x- x)*(this.x- x));
        return distance;
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

}

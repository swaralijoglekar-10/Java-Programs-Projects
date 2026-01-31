package com.swarali.OOP_GroupStudy;

class Bedroom {
    private String name;
    private Walll walll1;
    private Walll walll2;
    private Walll walll3;
    private Walll walll4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Walll walll1, Walll walll2, Walll walll3, Walll walll4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.walll1 = walll1;
        this.walll2 = walll2;
        this.walll3 = walll3;
        this.walll4 = walll4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return lamp;
    }
    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }

    public static void main(String[] args) {
        Walll wall1 = new Walll("West");
        Walll wall2 = new Walll("East");
        Walll wall3 = new Walll("South");
        Walll wall4 = new Walll("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}

class Ceiling{
    private int height;
    private int paintedColor;
    public Ceiling(int height,int paintedColor){
        this.height=height;
        this.paintedColor=paintedColor;
    }
    public int getHeight(){
        return height;
    }
    public int getPaintedColor(){
        return paintedColor;
    }
}

class Bed{
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.print("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn()
    {
        System.out.print("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void setGlobRating(int globRating) {
        this.globRating = globRating;
    }
}


class Walll{
    private String direction;

    public Walll(String direction){
        this.direction= direction;
    }

    public String getDirection() {
        return direction;
    }
}

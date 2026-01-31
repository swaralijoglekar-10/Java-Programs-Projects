package com.swarali.OOP_GroupStudy;

 class Wall{

    private double width;
    private double height;

    public Wall(){
        System.out.println("Default constructor");
    }

    public Wall(double width, double height){
        if(width<0) this.width=0;
        else this.width= width;
        if(height<0) this.height=0;
        else this.height= height;
    }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
        if(width<0) this.width=0;
        else this.width = width;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
        if(height<0) this.height = 0;
        else this.height = height;
     }

     public double getArea(){
        return this.height * this.width;
     }

     public static void main(String[] args) {
         Wall wall= new Wall(67.9, 23.56);
         System.out.println("Height of wall= "+wall.getHeight()+" " +
                 "and width of wall= "+ wall.getWidth()
         + "\n"+ "Area of wall= "+ wall.getArea());

     }
 }
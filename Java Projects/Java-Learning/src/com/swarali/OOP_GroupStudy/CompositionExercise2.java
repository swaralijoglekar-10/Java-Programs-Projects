package com.swarali.OOP_GroupStudy;

 class SmartKitchen {
     private CoffeeMaker brewMaster;
     private DishWasher dishWasher;
     private Refrigerator iceBox;

     public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator){
         this.brewMaster= coffeeMaker;
         this.dishWasher= dishWasher;
         this.iceBox= refrigerator;
     }
     public void addWater(){
        this.brewMaster.setHasWorkToDo(true);
     }
     public void pourMilk(){
        this.iceBox.setHasWorkToDo(true);
     }
     public void loadDishwasher(){
        this.dishWasher.setHasWorkToDo(true);
     }

     public void doKitchenWork(){
        this.iceBox.orderFood();
        this.dishWasher.doDishes();
        this.brewMaster.brewCoffee();
     }

     public static void main(String[] args) {
         CoffeeMaker coffeeMaker = new CoffeeMaker();
         Refrigerator refrigerator = new Refrigerator();
         DishWasher dishWasher= new DishWasher();

         SmartKitchen kitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);
         kitchen.addWater();
         kitchen.pourMilk();
         kitchen.loadDishwasher();
         kitchen.doKitchenWork();
     }

}

class Refrigerator{
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo(){
        return this.hasWorkToDo;
    }
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo= hasWorkToDo;
    }

    public void orderFood( ){
        if(this.hasWorkToDo == true) System.out.println("Refrigeration is being done");
    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo(){
        return this.hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo= hasWorkToDo;
    }

    public void doDishes(){
        if(this.hasWorkToDo == true) System.out.println("Dishes are being washed");
    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo(){
        return this.hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo= hasWorkToDo;
    }

    public void brewCoffee(){
        if(this.hasWorkToDo == true) System.out.println("Coffee is being done");
    }
}
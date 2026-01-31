package com.swarali.OOP_GroupStudy;

public class EncapsulationChallenge {
}

class Printer{
    private int tonerLevel;
    private int pagesPrinted; //count of printed pages

    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(tonerLevel<100 || tonerLevel>0)
        this.tonerLevel = tonerLevel;
        else
            this.tonerLevel=0;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
       if(this.tonerLevel+tonerAmount >100 ||
               this.tonerLevel+tonerAmount<0)
           return -1;
       this.tonerLevel+=tonerAmount;
       return this.tonerLevel;
    }
    public int printPages(int pages){
        if(this.duplex==true) {
            if(pages%2!=0) this.pagesPrinted=(pages/2)+1;
            else this.pagesPrinted=(pages/2);
        }
        else this.pagesPrinted = pages;
        return this.pagesPrinted;
    }

}

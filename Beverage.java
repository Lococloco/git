package com.cafe.menu;

public abstract class Beverage {
    private String name;
    private int basePrice;
    private int size;

    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    public Beverage(String name, int i, int size) {
        this.name = name;
        this.basePrice = i;
        this.size = size;
    }
    public int getprice(){
        return this.basePrice;
    }

    public boolean setSize(int size) {
        if (size == TALL || size == GRANDE || size == VENTI) {
            int a = this.size;
            this.size = size;
            if (a-this.size==-1){
                this.basePrice +=500;
            }
            else if(a-this.size==1){
                this.basePrice -=500;
            }
            else if(a == this.size-2){
                this.basePrice +=1000;
            }
            else if(a == this.size+2){
                this.basePrice -=1000;
            }
            return true;
        }
        return false;
    }
    public String getItemname(){
        return this.name;
    }
    public String getsize(){
        if(size == TALL){
            return "TALL";
        }
        else if (size == GRANDE){
            return "GRANDE";
        }
        else if (size == VENTI){
            return "BENTI";
        }
        return "0"    ;
    }


    public String getName(){
        return name;
    }
}
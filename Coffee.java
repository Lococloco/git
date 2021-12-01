package com.cafe.menu;


public class Coffee extends Beverage {
    public Coffee(String name){
        super(name, 4100, TALL);

    }
    /*public boolean setSize(int size) {
        if (size==GRANDE) {
            super.setSize(size);
            super.setprice(4600);
            return true;
        }
        else if (size==TALL) {
            super.setSize(size);
            super.setprice(4100);
            return true;
        }
        return false;
    }
*/
    }

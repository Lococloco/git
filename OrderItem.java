package com.cafe.order;

import com.cafe.menu.Beverage;

import java.util.ArrayList;

public class OrderItem {

    Beverage beverage;
    int quantity;
    public OrderItem(Beverage beverage, int quantity){
        this.beverage = beverage;
        this.quantity = quantity;
    }
    public  String toString(){
        /*if(beverage.getsize()==0){
            return "[ name="+beverage.getItemname()+", Price="+beverage.getprice()+", size=TALL, quantity="+quantity+" ]";
        }
        else if(beverage.getsize()==1){
            return "[ name="+beverage.getItemname()+", Price="+beverage.getprice()+", size=GRANDE, quantity="+quantity+" ]";
        }
        else if(beverage.getsize()==2){
            return "[ name="+beverage.getItemname()+", Price="+beverage.getprice()+", size=VENTI, quantity="+quantity+" ]";
        }*/
        return "[ name="+beverage.getItemname()+", Price="+beverage.getprice()+", size="+beverage.getsize()+", quantity="+quantity+" ]";
    }

    public Beverage getBeverage() {
        return beverage;
    }
}

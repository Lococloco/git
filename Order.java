package com.cafe.order;

import com.cafe.menu.Beverage;

import java.util.ArrayList;

import static com.cafe.menu.Beverage.TALL;


public class Order {

    private String Itemtype;
    private String Itemname;
    private int q;


    private ArrayList<OrderItem> items = new ArrayList<OrderItem>();

    public void item(String type, String name, int quantity) {
        this.Itemtype = type;
        this.Itemname = name;
        this.q = quantity;
    }

    public boolean setSize(String name, String size) {
        Beverage B = null;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getBeverage().getName().equals(name)) {
                B = items.get(i).getBeverage();
                break;
            }
            else if (items.get(i).getBeverage().getName().equals(name)) {
                B = items.get(i).getBeverage();
                break;
            }
        }
        if ("TALL".equals(size)) {
            return B.setSize(Beverage.TALL);

        }
        else if ("GRANDE".equals(size)) {
            return B.setSize(Beverage.GRANDE);

        }
        else if ("VENTI".equals(size)) {
            return B.setSize(Beverage.VENTI);

        }

        return false;
    }

    public void add(OrderItem item) {
        items.add(item);
    }
    public String getItemname(){
        return Itemname;
    }
    public void print() {

        for (int i = 0; i < items.size(); i++) {

            System.out.println("[ name="+items.get(i).getBeverage().getItemname()+", Price="+items.get(i).getBeverage().getprice()+", size="+items.get(i).getBeverage().getsize()+", quantity="+items.get(i).quantity+" ]");
        }
        System.out.printf("Total: %,d%n",cost());
    }
    public int cost(){
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
        sum+=items.get(i).getBeverage().getprice()*items.get(i).quantity;
            }
        return sum;
    }
    public  String toString(){
        return "[ name="+Itemname+", Price="/*+Beverage.getprice()+",size= "+Beverage.getsize()+", quantity="*/+q+" ]";
    }

}

    /*public boolean setSize(String name, String size){

            int s = Integer.parseInt(size);
            Beverage.getBev(name);
            return (Beverage.setSize(s));
*/






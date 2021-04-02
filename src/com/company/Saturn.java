package com.company;

public class Saturn extends Planets implements Printable {

    String size;

    public  Saturn(String size){this.size = size;}

    @Override
    public void print() {
        System.out.println("" +
                "Size: " + size + "\n" +
                "Color: " + Color.GRAY);
    }

}

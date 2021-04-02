package com.company;

public class Jupiter extends Planets implements Printable {

    int distance;

    public Jupiter(int distance) {
        this.distance = distance;
    }

    @Override
    public void print() {
        System.out.println("" +
                "Distance: " + distance + " km\n" +
                "Color: " + Color.BROWN);
    }

}

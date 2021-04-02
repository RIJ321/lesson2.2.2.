package com.company;

public class Earth extends Planets implements Printable {

    int remainingTime;

    public Earth(int remainingTime) {this.remainingTime = remainingTime;}

    @Override
    public void print() {
        System.out.println("" +
                "Remaining time: " + remainingTime + " years\n" +
                "Color: " + Color.MULTI);
    }
}

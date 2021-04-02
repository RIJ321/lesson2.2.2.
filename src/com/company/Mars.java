package com.company;

public class Mars extends Planets implements Printable {

    String isHaveLife;
    Color color;

    public Mars(String isHaveLife, Color color) {
        this.isHaveLife = isHaveLife;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("" +
                "Have life: " + isHaveLife + "\n" +
                "Color: " +color);
    }
}

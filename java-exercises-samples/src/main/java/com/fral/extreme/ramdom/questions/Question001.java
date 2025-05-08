package com.fral.extreme.ramdom.questions;

/**
 * What is the output of the following code?
 *
 * A: 23133
 * B: 12333
 * C: 22333   x
 * D: 12222
 * E: The code doesn't compile
 * F: An uncaught exception is thrown
 */

class Item {
    public Item() {}
    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Question001 {

    public static void main(String[] args) {
        Item a = new Item();
        a.setValue(1);

        Item b;
        b = a;
        a.setValue(2);
        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());

        Item c = b;
        b.setValue(3);
        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());
        System.out.println("c = " + c.getValue());
    }

}

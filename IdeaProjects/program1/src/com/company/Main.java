package com.company;

abstract class Parent {

    abstract int display(int i);

    int returnValue(int i) {
        return display(++i);
    }
}

class Child extends Parent {
    int display(int i) {
        return ++i;
    }
}

public class Main {
    public static void main(String[] args) {
        Child myObj = new Child();
        System.out.println(myObj.returnValue(1011));
    }
}

// numbdr class eg
class Number {
    double x;
    double y;

    //parameterized contructor
    Number(double x, double y) {
        this.setRealPart(x);
        this.setImaginaryPart(y);
    }

    //getters - setters
    public double getRealPart() {
        return x;
    }

    public double getImaginaryPart() {
        return y;
    }

    public void setRealPart(double x) {
        this.x = x;
    }

    public void setImaginaryPart(double y) {
        this.y = y;
    }

    //method to display
    public void display() {
        System.out.println(x + "" + y);
    }
}

class Complex extends Number {
    public Complex(double x, double y) {
        super(x, y);
    }

    public void checkComplex() {
        if (y == 0) {
            System.out.println("The given number is real");
        } else {
            System.out.println("The given number is complex");
        }
    }

    @Override
    public void display() {
        System.out.println(x + "" + "+" + "" + "i" + y);
    }
}

class PurelyImaginary extends Complex {
    public PurelyImaginary(double x, double y) {
        super(x, y);
    }

    public void checkPurelyImaginaryNumber() {
        if (x == 0 && y != 0) {
            display();
            System.out.println("The number is purely imaginary");
        } else {
            super.display();
            System.out.println("The number is not purely imaginary");
        }
    }

    @Override
    public void display() {
        System.out.println("i" + y);
    }
}
//source class - unchanged
}
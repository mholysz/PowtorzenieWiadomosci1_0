package PowtorzenieWiadomosci1;

import java.util.concurrent.ExecutionException;

public class Zadanie3 {

    private int a;
    private int b;
    private int c;

    public Zadanie3(int a, int b, int c) throws IllegalArgumentException {
        setA(a);
        setB(b);
        setC(c);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a >= 0) {
            this.a = a;
        } else
            throw new IllegalArgumentException();
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b >= 0)
            this.b = b;
        else throw new IllegalArgumentException();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        if (c >= 0) {
            this.c = c;
        } else throw new IllegalArgumentException();
    }

    public boolean isItTriangleRectangular() {
        return ((getA() + getB() > getC()
                && getB() + getC() > getA()
                && getC() + getA() > getB()) &&
                (((Math.pow(getA(), 2.0) + Math.pow(getB(), 2.0)) == Math.pow(getC(), 2.0)) || (Math.pow(getA(), 2.0) + Math.pow(getC(), 2.0) == Math.pow(getB(), 2.0) ||
                        (Math.pow(getC(), 2.0) + Math.pow(getB(), 2.0) == Math.pow(getA(), 2.0)))));
    }


    private double returnHypotenus() {
        if (isItTriangleRectangular()) {
            if ((Math.pow(getA(), 2.0) + Math.pow(getB(), 2.0)) == Math.pow(getC(), 2.0)) {
                return (double) getC();
            } else if ((Math.pow(getA(), 2.0) + Math.pow(getC(), 2.0)) == Math.pow(getB(), 2.0)) {
                return (double) getB();
            } else if ((Math.pow(getC(), 2.0) + Math.pow(getB(), 2.0)) == Math.pow(getA(), 2.0)) {
                return (double) getA();
            }
        }
        return -1;
    }


    public double hypotenuse() {
        return returnHypotenus();
    }

    public int circuit() {
        if (isItTriangleRectangular()) {
            return getA() + getB() + getC();
        } else
            throw new IllegalStateException("It is not rectangular");
    }

    public double area() {
        if (isItTriangleRectangular()) {
            if ((Math.pow(getA(), 2.0) + Math.pow(getB(), 2.0)) == Math.pow(getC(), 2.0)) {
                return (double) 0.5 * getA() * getB();
            } else if ((Math.pow(getA(), 2.0) + Math.pow(getC(), 2.0)) == Math.pow(getB(), 2.0)) {
                return (double) 0.5 * getA() * getC();
            } else {
                return (double) 0.5 * getC() * getB();
            }
        } else
            throw new IllegalStateException("It is not rectangular");
    }

}

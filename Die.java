package com.example.alex.finaproject;

/**
 * Created by Alex on 12/13/2017.
 */

import java.util.Random;

public class Die {
    private int sides;
    private int last;

    public int getSides() {
        return sides;
    }
    public void setSides(int sides) {
        this.sides = sides;
    }
    public int getLast() {
        return last;
    }
    public void setLast(int last) {
        this.last = last;
    }

    //constructor
    public Die(int sides)
    {
        this.sides = sides;
        this.last = 1;
    }

    // roll the die again
    public int roll()
    {
        Random r = new Random();
        this.last = r.nextInt(this.getSides())+1;
        return last;
    }

    // toString
    @Override
    public String toString() {
        return "1d" + this.sides + " [" + last + " / " + sides + "]";
    }

    public boolean equals(Die that)
    {
        if (this.getSides() == that.getSides() &&
                this.getLast() == that.getLast()) {
            return true;
        }
        return false;
    }


}

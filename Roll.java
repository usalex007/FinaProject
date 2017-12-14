package com.example.alex.finaproject;

/**
 * Created by Alex on 12/13/2017.
 */

import java.util.ArrayList;

public class Roll {

    // initialize
    ArrayList<Integer> rolls = new ArrayList<Integer>();
    int count;
    Die die;

    // getters and setters
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public ArrayList<Integer> getRolls() {
        return rolls;
    }
    public void setRolls(ArrayList<Integer> rolls) {
        this.rolls = rolls;
    }
    public Die getDie() {
        return die;
    }
    public void setDie(Die die) {
        this.die = die;
    }

    // default constructor gives burning hands
    public Roll() {
        this.count = 3;
        this.die = new Die(6);
    }

    // constructor that actually does anything
    public Roll(int count, Die die) {
        this.count = count;
        this.die = die;
    }

    // reroll
    public void reroll() {
        this.rolls.clear();
        for (int i = 0; i < this.count; i++)
        {
            this.rolls.add(this.die.roll());
        }
    }

    // return the sum of the dice
    public int total() {
        int temp = 0;
        for (int i = 0; i < this.rolls.size(); i++)
        {
            temp += this.rolls.get(i);
        }
        return temp;
    }

    // return the expected value of the roll
    public double expected()
    {
        return count * ((die.getSides()+1) / 2.0);
    }

    @Override
    public String toString() {
        String temp = "[" + this.count + "d" + this.die.getSides() + ":  {";

        for(int i = 0; i < this.rolls.size()-1; i++)
        {
            temp = temp + this.rolls.get(i) + ", ";
        }
        temp = temp + this.rolls.get(this.rolls.size()-1) + "} : " + this.total() + " / " + this.expected() + "]";
        return temp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Roll other = (Roll) obj;
        if (count != other.count)
            return false;
        if (die == null) {
            if (other.die != null)
                return false;
        } else if (!die.equals(other.die))
            return false;
        if (rolls == null) {
            if (other.rolls != null)
                return false;
        } else if (this.total() != other.total())
            return false;
        return true;
    }
}

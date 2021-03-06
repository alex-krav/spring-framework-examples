package org.example.core.spel;

public class NumberGuess {
    private int randomNumber;

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    @Override
    public String toString() {
        return "[ random: " + randomNumber + "]";
    }
}

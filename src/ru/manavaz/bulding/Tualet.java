package ru.manavaz.bulding;

public class Tualet implements Building {

    @Override
    public String getType() {
        return "WC";
    }

    @Override
    public String toString() {
        return "Tualet{WC}";
    }
}

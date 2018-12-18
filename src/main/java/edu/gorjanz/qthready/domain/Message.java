package edu.gorjanz.qthready.domain;

public class Message {

    private int number;
    private String color;

    // used only by Jackson for conversion
    public Message() {
    }

    public Message(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" + "number:" + number + ", color:" + color + '}';
    }
}

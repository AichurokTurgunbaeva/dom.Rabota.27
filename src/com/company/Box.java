package com.company;

public class Box <T, S> {
    private T name;
    private S number;

    public Box() {
    }
    public Box(T name, S number) {
        this.name = name;
        this.number = number;
    }
    public T getName() {
        return name;
    }
    public void  setName(T name) {
        this.name = name;
    }
    public S getNumber() {
        return number;
    }
    public void setNumber(S number) {
        this.number = number;
    }

    public static <T> T returnBox() {
        Box box = new Box("Magic Box",777);
        return (T)box;
    }
    @Override
    public String toString() {
        return "Boxes' name is: " + name+", "+
                "number: " + number + ". ";
    }
}

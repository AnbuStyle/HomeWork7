package ru.geekbrains;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int current = food - n;
        if (current < 0) return false;

        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("plate: " + food);
    }
}

package ru.mirea.gibo1.chernyavskaya.pr1;

public class DemoBall {
    public static void main(String[] args) {
        Ball c2 = new Ball("red", 13.5);
        System.out.println(c2);
        c2.setColor("green");
        c2.setRadius(20.3);
        System.out.println(c2);
    }
}

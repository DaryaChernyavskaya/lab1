package ru.mirea.gibo1.chernyavskaya.pr1;

public class DemoDog {
    public static void main(String[] args) {
        Dog c1 = new Dog("labrador", 8);
        System.out.println(c1);
        c1.setBreed("poodle");
        c1.setAge(5);
        System.out.println(c1);
    }
}

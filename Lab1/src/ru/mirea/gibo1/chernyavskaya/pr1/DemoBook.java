package ru.mirea.gibo1.chernyavskaya.pr1;

public class DemoBook {
    public static void main(String[] args) {
        Book c3 = new Book("Последний дюйм", 300);
        System.out.println(c3);
        c3.setBookname("Три товарища");
        c3.setTotalpages(456);
        System.out.println(c3);
    }
}

package ru.mirea.gibo1.chernyavskaya.pr1;
import java.lang.*;

public class Book {
    private String Bookname;
    private int Totalpages;

    public Book(String bookname, int totalpages) {
        Bookname = bookname;
        Totalpages = totalpages;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public int getTotalpages() {
        return Totalpages;
    }

    public void setTotalpages(int totalpages) {
        Totalpages = totalpages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Bookname='" + Bookname + '\'' +
                ", Totalpages=" + Totalpages +
                '}';
    }
}

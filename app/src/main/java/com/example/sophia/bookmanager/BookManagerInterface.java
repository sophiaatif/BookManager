package com.example.sophia.bookmanager;

import java.util.ArrayList;

/**
 * Created by Sophia on 9/3/2017.
 */

public interface BookManagerInterface {
    public int count();
    public Book getBook(int index);
    public Book createBook(String author, String title, int price, String isbn, String course);
    public ArrayList<Book> getAllBooks();
    public void removeBook(Book book);
    public void moveBook (int from, int to);
    public int getMinPrice();
    public int getMaxPrice();
    public float getMeanPrice();
    public int getTotalCost();
    public void saveChanges();
}

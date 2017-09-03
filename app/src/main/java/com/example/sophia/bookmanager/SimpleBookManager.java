package com.example.sophia.bookmanager;
import java.util.ArrayList;

/**
 * Created by Sophia on 9/3/2017.
 * add "initData(){call createBook}" in main class
 */

public class SimpleBookManager implements BookManagerInterface {

    @Override
    public Book createBook(String author, String title, int price, String isbn, String course) {
        Book bookObj = new Book(author, title, price, isbn, course);
        return bookObj;
    }
    @Override
    public ArrayList<Book> getAllBooks() {
        return null;
    }
    @Override
    public int count() {
        return 0;
    }

    @Override
    public Book getBook(int index) {

        return null;
    }
    @Override
    public void removeBook(Book book) {

    }

    @Override
    public void moveBook(int from, int to) {

    }

    @Override
    public int getMinPrice() {
        return 0;
    }

    @Override
    public int getMaxPrice() {
        return 0;
    }

    @Override
    public float getMeanPrice() {
        return 0;
    }

    @Override
    public int getTotalCost() {
        return 0;
    }

    @Override
    public void saveChanges() {

    }
}

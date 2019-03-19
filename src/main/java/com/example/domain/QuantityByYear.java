package com.example.domain;

public class QuantityByYear {

    private int year;
    private long quantity;

    public QuantityByYear(int year, long quantity) {
        this.year = year;
        this.quantity = quantity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "QuantityByYear{" +
                "year=" + year +
                ", quantity=" + quantity +
                '}';
    }
}

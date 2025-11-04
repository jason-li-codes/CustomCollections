package com.pluralsight;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        try {
            numbers.add(43); // this line should fail
        } catch (IllegalArgumentException e) {
            System.out.println("List is full and cannot accept more Objects.");
        }
        System.out.println(numbers.getItems().size());
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(15); // this line prevents Java from even compiling
    }

}

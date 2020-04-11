package com.codethinktank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExpMain {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = localDateTime.format(dateTimeFormatter);
        System.out.println(date);

    }
}

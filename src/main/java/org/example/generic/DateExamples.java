package org.example.generic;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateExamples {
    public static void main(String[] args) {
        // Get the current date and time
        Date currentDate = new Date();
        System.out.println("Current date and time: " + currentDate);

        // Get the time in milliseconds since the epoch
        long timeInMillis = currentDate.getTime();
        System.out.println("Time in milliseconds since epoch: " + timeInMillis);

        // Create a Date object from milliseconds
        Date dateFromMillis = new Date(timeInMillis);
        System.out.println("Date from milliseconds: " + dateFromMillis);

        // Formatting a date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted date: " + formattedDate);

        // Parsing a date string
        String dateString = "2025-05-28 10:30:00";
        try {
            Date parsedDate = formatter.parse(dateString);
            System.out.println("Parsed date: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
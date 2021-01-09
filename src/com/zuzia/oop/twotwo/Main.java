package com.zuzia.oop.twotwo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        for (int i = 0; i < 16; i++) {
            sb.append("na ");
        }
        sb.append("Batman!!!");
        int i = sb.indexOf("Batman");
        sb.insert(i, "...");
        System.out.println(sb.toString());

        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Today is %s\n", now.format(DateTimeFormatter.ofPattern("d MMMM y")));
        System.out.printf("The time is %s\n", now.format(DateTimeFormatter.ofPattern("H:m")));
        System.out.printf("100 days ago it was %s\n", now.minusDays(100).getDayOfWeek().toString().toLowerCase());
        LocalDateTime nowNextYear = now.plusYears(1);
        System.out.printf("1st of January next year will be on %s\n", nowNextYear.minusDays(nowNextYear.getDayOfYear() - 1).getDayOfWeek().toString().toLowerCase());
        System.out.printf("In 2 hours and 55 minutes the time will be %s\n", now.plusHours(2).plusMinutes(55));
        System.out.printf("3000 days ago it was%s a leap year\n", now.minusDays(3000).toLocalDate().isLeapYear() ? "" : "n't");
        System.out.printf("Current month has %d days\n", now.plusMonths(1).withDayOfMonth(1).getDayOfYear() - now.withDayOfMonth(1).getDayOfYear());
        LocalDateTime dateOfBirth = LocalDateTime.of(1998, 9, 13, 0, 0);
        System.out.printf("It's been %d days since I was born\n", Duration.between(dateOfBirth, now.withHour(0).withMinute(0)).toDays());


        LocalDate testDate = LocalDate.of(2021, 1, 9);
        System.out.println("getNextDay " + Date.getNextDay(testDate).toString());
        System.out.println("getPreviousDay " + Date.getPreviousDay(testDate));
        System.out.println("getNextSunday " + Date.getNextSunday(testDate));
        System.out.println("getTomorrow " + Date.getTomorrow());
        System.out.println("getYesterday " + Date.getYesterday());
    }
}

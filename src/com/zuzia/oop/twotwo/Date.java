package com.zuzia.oop.twotwo;

import java.time.LocalDate;

public class Date {
    public static LocalDate getNextDay(LocalDate date) {
        return date.plusDays(1);
    }

    public static LocalDate getTomorrow() {
        return LocalDate.now().plusDays(1);
    }

    public static LocalDate getPreviousDay(LocalDate date) {
        return date.minusDays(1);
    }

    public static LocalDate getYesterday() {
        return LocalDate.now().minusDays(1);
    }

    public static LocalDate getNextSunday(LocalDate date) {
        return date.plusWeeks(1).minusDays(date.getDayOfWeek().getValue());
    }
}

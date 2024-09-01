package com.app.listadapter;

import java.util.Calendar;
import java.util.Random;

public class RandomDateGenerator {

    public static String generateRandomDate() {
        Random random = new Random();
        // Устанавливаем границы для года
        int year = random.nextInt(114) + 2010; // от 2010 до 2123
        // Генерируем случайный месяц (от 1 до 12)
        int month = random.nextInt(12) + 1;
        // Генерируем случайный день в зависимости от месяца и года
        int day = random.nextInt(getDaysInMonth(month, year)) + 1;

        // Форматируем дату в нужный формат
        return String.format("%d.%02d.%02d", year, month, day);
    }

    private static int getDaysInMonth(int month, int year) {
        // Используем Calendar для получения количества дней в месяце
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static void main(String[] args) {
        // Генерация и вывод случайной даты
        String randomDate = generateRandomDate();
        System.out.println("Случайная дата рождения: " + randomDate);
    }
}

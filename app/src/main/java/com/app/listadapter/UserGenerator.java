package com.app.listadapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    private static final String[] FIRST_NAMES = {"Алексей", "Андрей", "Дмитрий", "Максим", "Сергей", "Петр", "Иван", "Захар", "Николай", "Никита"};
    private static final String[] LAST_NAMES = {"Иванов", "Петров", "Сидоров", "Кузнецов", "Смирнов", "Попов", "Лебедев", "Ковалев", "Новиков", "Морозов"};
    private static final String[] COUNTRIES = {"Россия", "США", "Германия"};
    private static final String[][] CITIES = {
            {"Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Казань"},
            {"Нью-Йорк", "Лос-Анджелес", "Чикаго", "Хьюстон", "Филадельфия"},
            {"Берлин", "Мюнхен", "Гамбург", "Франкфурт", "Кёльн"}
    };
    private static final Integer[] AVATARS = {R.drawable.item1,  R.drawable.item2,  R.drawable.item3,  R.drawable.item4,  R.drawable.item5};
    private final Random random;

    public UserGenerator() {
        this.random = new Random();
    }

    public List<UserModel> generateUsers(int count) {
        List<UserModel> users = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            String name = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)] + " " + lastName;
            int age = random.nextInt(86) + 14; // Возраст от 14 до 99
            String date = "";

            if (age == 22
                    || age == 32 || age == 42 || age == 52 || age == 62 || age == 72
                    || age == 82 || age == 92 || age == 21 || age == 31 || age == 41
                    || age == 51 || age == 61 || age == 71 || age == 81 || age == 91
            ){
                date = age + " год(а)";
            } else {
                date = age + " лет";
            }

            String country = COUNTRIES[random.nextInt(COUNTRIES.length)];
            String city = CITIES[getCountryIndex(country)][random.nextInt(5)];
            int images = AVATARS[random.nextInt(AVATARS.length)];
            users.add(new UserModel(images, name, lastName, country, city, date));
        }

        return users;
    }

    private int getCountryIndex(String country) {
        for (int i = 0; i < COUNTRIES.length; i++) {
            if (COUNTRIES[i].equals(country)) {
                return i;
            }
        }
        return -1; // Если страна не найдена
    }
}

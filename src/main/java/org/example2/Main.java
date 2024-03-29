package org.example2;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вейзер")
                .setAge(31)
                .setAddress("Краснодар")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Егор")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}


package ru.yandex.practikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        if((name.length() < 3) || (name.length() > 19)) {
            return false;
        } else if ((name.startsWith(" ")) || (name.endsWith(" "))) {
            return false;
        } else if (whitespaceCount(name) > 1) {
            return false;
        }

        return true;
    }

    private int whitespaceCount(String string) {

        int whitespaceCount = 0;
        String s = string.trim();

        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                whitespaceCount += 1;
            }
        }
        return whitespaceCount;
    }

}


package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = (lastName + " " + firstName + " " + middleName);
        System.out.println(fullName);

        String fullName1 = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullName1);

        StringBuilder fullNameNew = new StringBuilder("Ivanov Ivan Ivanovich");
        fullNameNew.delete(0, 21);
        fullNameNew.append("Иванов Семён Семёнович");
        fullNameNew = fullNameNew.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + fullNameNew);






















    }
}

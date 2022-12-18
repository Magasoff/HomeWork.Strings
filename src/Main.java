public class Main {
    public static void main(String[] args) {
        /**
         * Задание 1. ФИО Сотрудников.
         */
        String firstName = " Иван "; // имя в строке
        String middleName = " Иванович "; // отчество в строке
        String lastName = " Иванов "; // фамилия
        String fullName = lastName + firstName + middleName; // ФИО
        System.out.println(" ФИО сотрудника " + fullName);
        /**
         * Задание 2.Изменить ФИО на заглавные буквы.
         */
        String newFirstName = fullName.toUpperCase();
        System.out.println(" Данные ФИО сотрудника для заполнения отчета " + newFirstName);
        /**
         * Задание 3. Заменить букву ё на е.
         */
        String newFullname = "Иванов Семён Семёнович";
        newFullname = newFullname.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + newFullname);
    }
}



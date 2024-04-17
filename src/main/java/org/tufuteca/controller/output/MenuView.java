package org.tufuteca.controller.output;

public class MenuView {

    public void displayAuthOrRegMenu() {
        System.out.println("Меню:");
        System.out.println("1. Авторизация");
        System.out.println("2. Регистрация");
        System.out.println("3. Выход");
    }
    public void diplayUserMenu(){
        System.out.println("Добро пожаловать: ");
        System.out.println("1. Добавить тренировку");
        System.out.println("2. Изменить тренировку");
        System.out.println("3. Удалить тренировку");
        System.out.println("4. Посмотреть все тренировки");
        System.out.println("5. Посмотреть статистику о тренировках");
    }
    public void diplayAdminMenu(){
        System.out.println("Вы вошли в учетную запись администратора");
        System.out.println("1. Добавить тип тренировки");
        System.out.println("2. Посмотреть все тренировки");
        System.out.println("3. Посмотреть тренировки определенного пользователя");
        System.out.println("4. Изменить данные пользователя");
    }


}

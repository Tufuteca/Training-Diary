package org.tufuteca.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidation {

    public int integerInput(Scanner scanner) {
        int num;
        do {
            try {
                num = scanner.nextInt();
                return num;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Ошибка! Повторите снова. Введите целое число!");
            }
        } while (true);
    }


}



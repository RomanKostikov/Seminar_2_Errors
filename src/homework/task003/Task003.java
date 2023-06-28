package homework.task003;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task003 {
    /*
    Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
    Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением
    "Первое число вне допустимого диапазона".
    Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением
    "Второе число вне допустимого диапазона".
    Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с
    сообщением "Сумма первого и второго чисел слишком мала".
    Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением
    "Деление на ноль недопустимо".
    В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
    - необходимо создать 3 класса собвстенных исключений
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1, num2, num3;
            System.out.print("Введите первое число: ");
            num1 = sc.nextInt();
            System.out.print("Введите второе число: ");
            num2 = sc.nextInt();
            System.out.print("Введите третье число: ");
            num3 = sc.nextInt();
            check(num1, num2, num3);
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число!");
        }
    }


    public static void check(int num1, int num2, int num3)
            throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if (num1 > 100) throw new NumberOutOfRangeException("Первое число вне допустимого диапазона!");
        if (num2 < 0) throw new NumberOutOfRangeException("Второе число вне допустимого диапазона!");
        if (num1 + num2 < 10) throw new NumberSumException("Сумма первого и второго чисел слишком мала!");
        if (num3 == 0) throw new DivisionByZeroException("Деление на ноль недопустимо");
        System.out.println("Проверка пройдена успешно!");
    }
}


class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }

}

class NumberSumException extends Exception {
    public NumberSumException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
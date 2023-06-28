package homework.task001;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task001 {
    /*
    Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно
    положительным. Если число отрицательное или равно нулю, программа должна выбрасывать
    исключение InvalidNumberException с сообщением "Некорректное число". В противном случае,
    программа должна выводить сообщение "Число корректно".
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            check(sc.nextInt());
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число!");
        }
    }

    public static void check(int num) throws InvalidNumberException{
        if (num <= 0) throw new InvalidNumberException("Некорректное число");
        System.out.printf("Число корректно! Вы ввели: %d", num);
    }
}

class InvalidNumberException extends Exception{
    public InvalidNumberException(String message) {
        super(message);
    }
}

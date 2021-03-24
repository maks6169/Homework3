package geekbrains.lesson_3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        zad1();
//        zad2();

    }

    public static void zad1() {
        Random random = new Random();
        int RandomNumber = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("У вас 3 попытки угадать число. Числа от 0 до 9!");
        System.out.print(" ");
        System.out.println("1 попытка. Введите число");
        for (int i = 0; i < 3; i++) {
            int number = scanner.nextInt();
            if (number < 0 || number > 9) {
                i = -1;
                System.out.println("Сказано же. От 0 до 9! Заново!!!");
                continue;
            }
            {
                if (RandomNumber == number) {
                    System.out.println("Поздравляю! Вы угадали! Заданное число = " + RandomNumber);
                    break;
                }
                {
                    if (number > RandomNumber) {
                        System.out.print("Загаданное число меньше. ");
                    } else {
                        System.out.print("Загаданное число больше. ");
                    }
                    if (i == 0) System.out.println("Вы не угадали. 2 попытка. Введите число");
                    if (i == 1) System.out.println("Вы не угадали. 3 попытка. Введите число");
                    if (i == 2) System.out.println("Вы проиграли! Загаданное число = " + RandomNumber);
                }
            }
        }
    }
}





package group_1;
/*
Таймер
Функционал:

Пользователь может задать время в минутах и секундах.
После старта отсчет времени идет в обратном порядке.
По истечении времени выводится уведомление в консоль.
Интерфейс:

Ввод времени через консоль.
Вывод оставшегося времени в консоль каждую секунду.
Вывод сообщения о завершении времени.
 */

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int seconds = scanner.nextInt();




        printEachSec(seconds);


    }

    public static void printEachSec(int seconds) {
        System.out.println(seconds);
        while (seconds > 0) {
            sleep(1000);
            System.out.println(--seconds);

        }
        System.out.println("Время вышло");
    }

    public static void sleep (long sleepDurationInMs) {
        try {
           Thread.sleep(sleepDurationInMs);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
    }


}

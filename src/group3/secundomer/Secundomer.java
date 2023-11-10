package group3.secundomer;
/*Функционал:

При старте начинается отсчет времени.
При остановке показывается время с момента старта.
Интерфейс:

Команды старт и стоп через консоль.
Вывод времени с момента старта до остановки.

 */


import java.util.Scanner;

public class Secundomer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set seconds");

        String seconds = scanner.nextLine();
        int parsed = Integer.parseInt(seconds);
        printEachSec(parsed);
    }

    // message from AR: исправил метод, привел к рабочему состоянию
    public static void printEachSec(int time) {
        while (time > 0) {
            sleep(1000);
            System.out.println(time--);
        }
        System.out.println("Time is over");
    }

    public static void sleep(long sleepDurationINMs) {
        try {
            Thread.sleep(sleepDurationINMs);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



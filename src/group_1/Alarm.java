package group_1;
/*
Будильник
Функционал:

Пользователь задает конкретное время для сигнала.
Когда наступает заданное время, происходит уведомление.
Интерфейс:

Ввод времени сигнала через консоль.
Уведомление в консоль, когда наступает заданное время.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите время для будильника в формате 'yyyy-MM-dd HH:mm'");
        String alarm = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(alarm, formatter);
        System.out.println(dateTime);
        System.out.println(LocalDateTime.now());


        while (true) {
            LocalDateTime time = LocalDateTime.now();
            if (time.equals(dateTime)) {
                System.out.println("ALARM!!!!");
                break;
            }
        }
    }
}

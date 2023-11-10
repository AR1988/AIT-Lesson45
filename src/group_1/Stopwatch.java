package group_1;
/*
Секундомер
Функционал:

При старте начинается отсчет времени.
При остановке показывается время с момента старта.
Интерфейс:

Команды старт и стоп через консоль.
Вывод времени с момента старта до остановки.
 */

/*
public class DateOperation {
    public static int getAge(String birthDate) {
        LocalDate date = mapStringToLocalDate(birthDate);
        return (int) ChronoUnit.YEARS.between(date, LocalDate.now());
    }

    public static String[] sortStringDates(String[] dates) {
        String[] res = Arrays.copyOf(dates, dates.length);
        Arrays.sort(res, (d1, d2) -> mapStringToLocalDate(d1).compareTo(mapStringToLocalDate(d2)));
        return res;
    }
    private static LocalDate mapStringToLocalDate(String stringDate) {
        LocalDate res = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
//		if (stringDate.contains("-")) {
//			res = LocalDate.parse(stringDate, DateTimeFormatter.ISO_LOCAL_DATE);
//		} else {
//			res = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		}
        return res;
    }
}
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 'start' чтобы запустить секундомер");
        scanner.nextLine();
        LocalDateTime localDateTimeStart = LocalDateTime.now();
        System.out.println("Введите 'stop' чтобы остановить секундомер");
        scanner.nextLine();
        LocalDateTime localDateTimeFinish = LocalDateTime.now();

        long secondsCount = ChronoUnit.SECONDS.between(localDateTimeStart, localDateTimeFinish);
        System.out.println("Прошло " + secondsCount + " секунд");


    }

}

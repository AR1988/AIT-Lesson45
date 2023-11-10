package andre.reutow.timer;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 10.11.2023
 */
public interface Timer {

    void startTimer(long seconds);

    long stopWatch(Scanner scanner);

    LocalTime stopWatchInTime(Scanner scanner);

    void alarm(LocalDateTime timeToWakeUp);

    void pomidoroTimer();
}

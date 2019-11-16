//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

package linearalgo;

import java.util.Scanner;

public class Task5 {
    private static Scanner scan = new Scanner(System.in);
    private static final int MINUTES = 60;
    private static final int HOURS = 3600;


    public static void main(String[] args) {
        int time = scan.nextInt();
        System.out.printf("%2s ч %2s мин %2s с", getTime(getHours(time)),
                getTime(getMinutes(time)), getTime(getSeconds(time)));
    }

    private static int getHours(int time) {
        if (time > 0) {
            return (int) (time / HOURS);
        } else {
            return -1;
        }
    }

    private static int getMinutes(int time) {
        if (time > 0) {
            return (int) ((time % HOURS) / MINUTES);
        } else {
            return -1;
        }
    }

    private static int getSeconds(int time) {
        if (time > 0) {
            return (int) (time % MINUTES);
        } else {
            return -1;
        }
    }

    private static String getTime(int time) {
        return time < 10 & time > 0 ? "0" + Integer.toString(time) : Integer.toString(time);
    }
}


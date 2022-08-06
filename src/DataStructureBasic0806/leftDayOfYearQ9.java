package DataStructureBasic0806;

import java.util.Scanner;

public class leftDayOfYearQ9 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
        while(--m != 0)
            d += mdays[isLeap(y)][m - 1];
        return 365 + isLeap(y) - d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : ");
            int year = sc.nextInt();
            System.out.print("월 : ");
            int month = sc.nextInt();
            System.out.print("일 : ");
            int day = sc.nextInt();

            System.out.printf(year + "년이 " + dayOfYear(year, month, day) + "일 남았습니다.\n");

            System.out.print("한 번 더 할까요? (1.예/2.아니오) : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}

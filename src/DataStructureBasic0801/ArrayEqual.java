package DataStructureBasic0801;

import java.util.Scanner;

// 두 배열이 같은가
public class ArrayEqual {
    // 두 배열 a, b의 모든 요소가 같은가
    static boolean equals(int[] a, int[] b) {
        if(a.length != b.length)
            return false;

        for(int i = 0; i < a.length; i++)
            if(a[i] != b[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
        int na = sc.nextInt(); // 배열 a의 요솟수

        int[] a = new int[na]; // 요솟수가 na인 배열

        for(int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int nb = sc.nextInt();

        int[] b = new int[nb];

        for(int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }

        System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));
    }
}

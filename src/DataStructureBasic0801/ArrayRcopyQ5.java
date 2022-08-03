package DataStructureBasic0801;

import java.util.Scanner;

public class ArrayRcopyQ5 {
    static void rcopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for(int i = 0; i < num; i++) {
            a[i] = b[b.length - i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a의 요솟수 : ");
        int numa = sc.nextInt();
        int[] na = new int[numa];
        for(int i = 0; i < numa; i++){
            System.out.print("a[" + i + "] : ");
            na[i] = sc.nextInt();
        }

        System.out.print("b의 요솟수 : ");
        int numb = sc.nextInt();
        int[] nb = new int[numb];
        for(int i = 0; i < numb; i++) {
            System.out.print("b[" + i + "] : ");
            nb[i] = sc.nextInt();
        }

        rcopy(na, nb);

        System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사하였습니다.");

        for(int i = 0; i < numa; i++)
            System.out.println("a[" + i + "] = " + na[i]);

    }
}

package DataStructureBasic0804;

import java.util.Scanner;

public class CardConvQ6 {
    static int cardConv(int x, int r, char[] d) {
        int digits = 0; // 변환 뒤의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
            x /= r;
        } while (x != 0);

        for(int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 뒤의 자릿수
        int retry; // 한 번 더?
        char[] cno = new char[32]; // 변환 뒤의 각 자리를 저장하는 문자인 배열

        System.out.println("10진수를 기수변환합니다.");
    }
}

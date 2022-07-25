package AlgorithmBasic0725;

public class Med3 {

    // 다른 방법
    static int med3 (int a, int b, int c) {
        if((b >= a && c <= a) || (b >= a && c >= a))
            return a;
        else if((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }
    // 가장 처음의 if가 성립한 경우 2번째의 if에서도 같은 판단을 수행하므로 효율이 나빠진다.

}

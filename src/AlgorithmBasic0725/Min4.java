package AlgorithmBasic0725;

public class Min4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        if(d < min)
            min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min(5, 7, 3, 1) : " + min4(5, 7, 3, 1));
    }
}

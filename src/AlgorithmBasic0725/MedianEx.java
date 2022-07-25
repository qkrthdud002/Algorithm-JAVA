package AlgorithmBasic0725;

public class MedianEx {
    static int median(int a, int b, int c) {
        if(a >= b)
            if(b >= c)
                return b;
            else if(a <= c)
                return a;
            else
                return c;
        else if(a > c)
            return a;
        else if(b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("median(3, 2, 1) = " + median(3, 2, 1));
        System.out.println("median(3, 2, 2) = " + median(3, 2, 2));
        System.out.println("median(3, 1, 2) = " + median(3, 1, 2));
        System.out.println("median(3, 2, 3) = " + median(3, 2, 3));
        System.out.println("median(2, 1, 3) = " + median(2, 1, 3));
        System.out.println("median(3, 3, 2) = " + median(3, 3, 2));
        System.out.println("median(3, 3, 3) = " + median(3, 3, 3));
        System.out.println("median(2, 2, 3) = " + median(2, 2, 3));
        System.out.println("median(2, 3, 2) = " + median(2, 3, 2));
        System.out.println("median(1, 3, 2) = " + median(1, 3, 2));
        System.out.println("median(2, 3, 3) = " + median(2, 3, 3));
        System.out.println("median(1, 2, 3) = " + median(1, 2, 3));
    }
}

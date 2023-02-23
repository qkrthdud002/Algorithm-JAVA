package JavaLecture;

public class MainBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean(); // heap 메모리에 올라간다.

        math.printClassName();
        math.printNumber(5000);
        int x = math.getOne();
        System.out.println(x);
        int value = math.plus(10, 20);
        System.out.println(value);
    }
}

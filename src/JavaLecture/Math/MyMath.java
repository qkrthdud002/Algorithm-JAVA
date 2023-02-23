package JavaLecture.Math;

public class MyMath {
    // 자동 생성 - 기본 생성자는 생성자가 없을 경우 자동으로 생성한다.
    public MyMath() {}

    public static int abs(int x) {
        if(x < 0)
            return x * -1;
        else
            return x;
    }
}

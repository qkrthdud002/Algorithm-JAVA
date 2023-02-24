package JavaLecture.car;

// 버스는 자동챠의 한 종류다.
public class Bus extends Car {

    // overriding. 만약 매개변수가 다르다면 오버로딩이 된다.
    public void run() {
        System.out.println("후륜구동으로 달린다.");
    }

    public void 안내방송() {
        System.out.println("안내방송하다.");
    }

}

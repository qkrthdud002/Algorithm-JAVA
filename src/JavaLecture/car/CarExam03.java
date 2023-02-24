package JavaLecture.car;

public class CarExam03 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1); // println(Object x) - Object로 참조할 수 있는 것은 무엇이든 받을 수 있다.
    }
}

// 부모 타입의 변수로 자식 인스턴스를 참조할 수 있다.
// 조상타입의 변수로 후손 인스턴스를 참조할 수 있다.
// Car c1 = new Bus();
// Car c2 = new SuperCar(); // 이층버스는 Car의 자손이다.
// Object o1 = new Bus();
// Object 02 = new SuperCar();
// System.out.println(o1.toString()) == System.out.println(o1);
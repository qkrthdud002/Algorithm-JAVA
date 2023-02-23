package JavaLecture.Person;

public class PersonTest {
    public static void main(String[] args) {
//        Person p1; // p1은 null이다. -> NullPointException 오류 발생.
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "이이이"; // 문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있다. 되도록 new 사용 X(String 사용 할 땐).
        p1.address = "일산";
        p1.isVip = true;
        p2.name  = "김김김";
        p2.address = "서울";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.address.length());
        System.out.println(p1.isVip);

        System.out.println("----------------------------");

        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.address.length());
        System.out.println(p2.isVip);
    }
}

package JavaLecture;

public class UserExam {
    public static void main(String[] args) {

        User user = new User("asdf@gmail.com", "aaaa");

//        System.out.println(user.getEmail());
//        System.out.println(user.getName());
        System.out.println(user); // toString()을 사용했기 때문에 출력이 에러없이 잘 나온다. 암호같이 민감한 코드는 toString하지 않는다.

        User user2 = new User("asdfasdf@gmail.com", "1234", "bbbb");
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
        System.out.println(user2.getName());

    }
}

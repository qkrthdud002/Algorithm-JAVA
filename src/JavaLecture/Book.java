package JavaLecture;

public class Book {
    private String title;
    private int price; // field price

    // 필드의 값을 수정하고 얻기 위한 메소드를 만는다. setter, getter
    // setter, getter - 프로퍼티(property)
    // setPrice(), getPrice()를 price 프로퍼티 라고 한다.
    // 이 코드에서 프로퍼티는 두개이다. Price, Title
    public int getPrice() {
        return this.price; // this는 내자신 인스턴스를 참조하는 예약어.
    }

    public void setPrice(int price) { // 지역 변수 price
        this.price = price;
    }

    // 만약 getName(), setName()이면 name 프로퍼티라고 한다.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

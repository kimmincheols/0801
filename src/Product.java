
public class Product {

	String name;			//맴버 변수
	int price;
	String color;
	
	void display() {		//맴버 메소드
		System.out.printf("이름은 %s, 가격은 %d, 색상은 %s\n", name, price, color);
	}
}
// 맴버 변수와 멤버 메소드는 주소로 접근한다.
// 주소는 new할 때 주소가 생성이 된다.
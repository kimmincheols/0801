
public class ArrayDemo4 {
	public static void main(String[] args) {
//		Product.pencil = new Product();
//		pencil.name = "연필";
//		pencil.price = "연필";
//		pencil.color = "연필";
//		
//		Product.mouse = new Product();
//		mouse.name = "연필";
//		mouse.price = "연필";
//		mouse.color = "연필";
		
		Product [] array = new Product[3];
		for(int i = 0; i < array.length; i++) {
			array[i] = new Product();
		}
		
		for(int i = 0; i < array.length; i++) {
			array[0].name = "연필"; array[i].price = 200; array[i].color = "Black";
			array[1].name = "마우스"; array[i].price = 50000; array[i].color = "Silver";
			array[2].name = "키보드"; array[i].price = 10000; array[i].color = "white";
		
			for(int i = 0; i < array.length; i++) {
				System.out.println((i+1) + "번째 상품 설명");
				System.out.println("이름 :" + array[i].name);
				System.out.println("가격 :" + array[i].price);
				System.out.println("색상 :" + array[i].color);
			}
		}
	}
}

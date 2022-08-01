import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("재품의 갯수는 : ");
		int count = sc.nextInt();
		sc.nextLine();
		
		Product [] array = new Product[count];
		for( Product p : array ) {
			p = new Product();
			System.out.println("Name :");
			p.name = sc.nextLine();
			System.out.println("Price :");
			p.price = sc.nextInt();
			sc.nextLine();
			System.out.println("Color :");
			p.color = sc.nextLine();
			p.display();	
		}
	}
}

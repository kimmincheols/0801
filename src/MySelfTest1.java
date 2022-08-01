import java.util.Scanner;

public class MySelfTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력해 주세요. : ");
		int Money  = sc.nextInt();
		int [] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		for(int i = 0; i < array.length; i++) {
			int mok = Money/array[i];
			int na = Money%array[i];
			System.out.println(array[i] + "원권 = " + mok);
			Money = na;
		}
		
	}
}

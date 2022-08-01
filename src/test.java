import java.util.Scanner;
/* 자판기 입력 프로그램 
 * 50000원권 : 2
 * 10000원권 : 4
 * 5000원권 : 1
 * 1000원권 : 0
 * 500원권 : 1
 * 100원권 : 1
 */
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int [] array = new int[8];
//		
//		System.out.print("숫자를 입력해 주세요. : "); sc.nextInt();
//			for(int i = 0; i < 9; i++) {
//				System.out.print("50000원권" + );
//		}
//	
		System.out.println("Money : ");
		int money = sc.nextInt(); 					//145678
		
		int [] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		System.out.println(" 방 갯수는 : " + array.length);
//		int mok = money / 50000; //2
//		int na = money % 50000; //45678
//		mok = na/10000; //4
//		na = na % 10000; //5678
//		mok = na / 5000;
//		na = na % 5000; //678
		for(int i = 0; i < array.length; i++) {
			int mok = money / array[i];				//몫을 구함
			int na = money % array[i];			//나머지
			System.out.println(array[i] + "원권 : " + mok);
			money = na;
			
		}
			
		
	}
}

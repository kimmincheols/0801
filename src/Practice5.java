import java.util.Scanner;

public class Practice5 {
public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력해 주세요 : ");
	int su = sc.nextInt();
	int count = 0;
	System.out.println(1 + "\t");
	for(int i = 2; i < su; i++) {
		if(su % i ==0) System.out.println(i + "\t");
		count++;
		if(count % 3 == 0) System.out.println();
		}
	
	System.out.println(su);

}

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int su = sc.nextInt();
		System.out.println(1 + "\t");
		for(int i = 2; i < su; i++) {
			if(su % i ==0) System.out.println(i + "\t");
			
		}
		
		System.out.println(su);
		
		
	}
}
}


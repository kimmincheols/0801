import java.util.Scanner;

public class MySelfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요. : ");
		int sigan = sc.nextInt();
		
		int hour = sigan/3600;
		int sec = sigan%3600;
		int min = sec/60;
		sec = sec%60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", sigan, hour, min, sec);
		
	}
}

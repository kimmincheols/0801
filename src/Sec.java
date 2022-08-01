import java.util.Scanner;

//초를 입력받아서 시와 분과 초로 변환하는 프로그램
	//입력 계산할 초 : 8492초
	//출력 : 8492초는 ~~시간 ~~분 ~~초입니다.

public class Sec {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.print("초를 입력해 주세요. : ");
	int su = sc.nextInt();
	
	int hour = su / 3600;
	int sec = su % 3600;
	int min = sec / 60;
	sec = sec % 60;
	
	System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", su, hour, min, sec);
	
	}
}

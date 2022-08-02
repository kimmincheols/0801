import java.util.Scanner;

/* 첫째 수 :
 * 둘째 수 :
 * <출력>
 * ~와 ~의 최소공배수, 최대공약수
 * A = aG
 * B = bG
 * L = abG
 */
public class LCMGCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫째수를 입력해 주세요. : ");
		int su = sc.nextInt();
		System.out.println("둘째수를 입력해 주세요. :");
		int hak = sc.nextInt();
		System.out.println("첫째 수는 " + su + "이고, 둘째 수는 " + hak);
		
		int gcm = 0;
		for(int i = 2; i < su ; i ++) {
			if(su % i == 0 && hak % i == 0)	gcm = i;		
		}
		int lcm = (su / gcm) * (hak / gcm) * gcm;
		System.out.printf("%d와 %d의 GCM = %d, LCM = %d\n", su, hak, gcm, lcm);
		
	}
}

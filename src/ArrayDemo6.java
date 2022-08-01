import java.util.Scanner;

public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student jimin = new Student();
		
		System.out.println("Name : ");	jimin.name = sc.nextLine();
	
		System.out.println("Hakbun : ");	jimin.hakbun = sc.nextLine();
		
		System.out.println("Korean : ");	jimin.kor = sc.nextInt();
	
		System.out.println("English : ");	jimin.eng = sc.nextInt();
	
		System.out.println("Math : ");	jimin.mat = sc.nextInt();
		
		jimin.calcTot();
		jimin.calcAvg();
		jimin.calcGrade();

		jimin.dispaly();
	}
}

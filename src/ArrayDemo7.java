import java.util.Scanner;

public class ArrayDemo7 {
	public static void main(String[] args) {
		System.out.println(" 학생은 몇명입니까? :");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();	//몇명
		sc.nextLine();
		
		Student [] array = new Student[count];
		
		for( Student std : array ) {
			std = new Student();
			
			System.out.println("Name : ");	std.name = sc.nextLine();
			
			System.out.println("Hakbun : ");	std.hakbun = sc.nextLine();
			
			System.out.println("Korean : ");	std.kor = sc.nextInt();
		
			System.out.println("English : ");	std.eng = sc.nextInt();
		
			System.out.println("Math : ");	std.mat = sc.nextInt();
			sc.nextLine();
			std.calcTot();
			std.calcAvg();
			std.calcGrade();
			std.dispaly();
		}
		
	}
}

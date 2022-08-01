
public class ArrayDemo3 {
	public static void main(String[] args) {
		//배열 초기값
		//정수형 : 0으로 초기화
//		int [] array = new int[4];
//		for(int i = 0 ; i < array.length; i++) {
//			System.out.print("array [" + i + "] =" + array[i] + "\t");
//		}
		//실수형 : 0.0 으로 초기화
//		double [] array = new double[4];
//		for(int i = 0 ; i < array.length; i++) {
//			System.out.print("array [" + i + "] =" + array[i] + "\t");
//		}
		// 문자형 : NULL값, '\0', '\u0000'
//		char [] array = new char[4];
//		for(int i = 0 ; i < array.length; i++) {
//			System.out.print("array [" + i + "] =" + array[i] + "\t");
//		}
		//boolean 형 : false 
//		boolean [] array = new boolean[4];
//		for(int i = 0 ; i < array.length; i++) {
//			System.out.print("array [" + i + "] =" + array[i] + "\t");
//		}
		//참조형 : null번지
		String [] array = new String[4];
		for(int i = 0 ; i < array.length; i++) {
			System.out.print("array [" + i + "] =" + array[i] + "\t");
		}
	}
}

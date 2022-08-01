
public class ArrayDemo {
	public static void main(String[] args) {
		int [] array;	// 배열의 선언
//		array = new int[4];; //배열 생성	지정한 방의 갯수는 절.대 변하지 않는다.
//		array[0] = 6;
//		array[1] = 9;
//		array[2] = 12;
//		array[3] = 15;
//		
//		for(int i = 0; i<4; i++) {
//			System.out.print("array["+ i + "] =" + array[i] + "\t");
//		}
		
//		double [] weight; // 선언
//		weight = new double[] { 67.3, 78.9, 52.3}; // 생성 및 할당
//		for(int i = 0; i < 3 ; i ++) {
//			System.out.printf("weight{%d] = %.2f\t", i, weight[i]);
//		}

		char [] grades = {'A', 'C', 'B', 'B', 'C'};
		int i = 0;
		while(i < 5) {
			System.out.print("grades[" + i + "] = " + grades[i] + "\t");
			i++;
		}
	}
}


public class ArrayDemo5 {
	public static void main(String[] args) {
		int [] array = {4,5,8,1,3};
		for(int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
//		}
//		for( int su : array ) {														// :(클론) 의 오른쪽은 대상 왼쪽은 값을 저장. 이러한 for문은 인덱스가 없고,
//			System.out.println("[" + i + "] 번째 값은 " +su);												//   처음부터 끝까지 값을 출력하기 위해 사용.(인덱스가 필요하지 않을 경우)
//			
//		}
	}
}

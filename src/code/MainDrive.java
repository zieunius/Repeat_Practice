package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		1. 12345 를 5번 반복한다.
		
//		12345
//		12345
//		12345
//		12345
//		12345
		
//		바깥에 위치하는 for문 => 상대적으로 느리게 반복.
//		문제에서는 가로와 세로 중 세로 줄바꿈 담당.
		
		for(int i=0;i<5;i++) {
			
//			바쁘게 돌아가는 반복을 안쪽에 중첩.
//			문제에서는 가로로 숫자를 찍는 역할 담당.
			for(int j=0;j<5;j++) {
				System.out.print(j+1);
			}
//			가로로 1~5를 찍고나면 줄을 바꿈.
			System.out.println();
		}
	}
	
}

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
//		for(int i=0;i<5;i++){
//			
////			바쁘게 돌아가는 반복을 안쪽에 중첩.
////			문제에서는 가로로 숫자를 찍는 역할 담당.
//			for(int j=0;j<5;j++){
//				System.out.print(j+1);
//			}
////			가로로 1~5를 찍고나면 줄을 바꿈.
//			System.out.println();
//		}
		
		
//		2. 구구단 2단까지 찍기. => 2~9단까지 출력하기.
		
//		2 x 1 = 2
//		2 x 2 = 4
//		...
//		3 x 1 = 3
//		...
//		3 x 9 = 27
//		...
//		9 x 9 = 81
		
//		반복요소 2개.
//		1) 각 단의 내용을 출력
//		2) 단 자체를 출력.
		
//		둘 중에 더 바쁜것 : 1)반복 => j
//		반복을 먼저 작성. : i
		
//		단 자체를 담당하는 i
//		for(int i=2;i<=9;i++){
//			
////			각 단의 내용을 출력하는 j
//			for(int j=0;j<9;j++) {	
////				String.format + i,j를 이용해 상황에 맞는 문장 출력
//				System.out.println(String.format("%d x %d = %d",i,j+1,i*(j+1)));			
//			}
//		}
		
		
//		3. 별찍기
		
//		3.1) 정사각형 5*5사이즈의 별 찍기 (연습문제)
//		*****
//		*****
//		*****
//		*****
//		*****
		
////		세로 줄바꿈
//		for(int i=0;i<5;i++){
////			가로 별찍기
//			for(int j=0;j<5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//		3.2) 기초 삼각형 별찍기
//		*   i:0일때 별은 1개
//		**  i:1일때 별은 2개
//		*** i:2일때 별은 3개
//		**** i:3일때 별은 4개
//		***** i:4일때 별은 5개
		
//		가로 출력담당 변수 : j (안쪽 for)
//		세로 줄바꿈 변수 : i (바깥 for)
		
//		반복문의 반복횟수 ? 반복문의 조건식이 담당. =>조건식의 조건을 변수로 활용하자!
		
//		for(int i=0;i<5;i++) {
//		 System.out.print("*");
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//		 System.out.println();
//		}
		
//		강사님 답
		
		for(int i=0;i<5;i++) {
			for(int j=0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}

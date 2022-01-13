package mvc.controller;

import java.util.Scanner;

public class ScoreController {

	public static void main(String[] args) {
		// 학생 데이터를 입력 받아서 StudentVO객체를 생성(여러 학생 정보: 반복문)
		// 생성된 StudentVO객체를 ArrayList에 추가
		Scanner s1 = new Scanner(System.in); // 문자열 입력용 Scanner
		Scanner s2 = new Scanner(System.in); // 숫자 입력용 Scanner
		
		System.out.println("*** 학생들의 성적을 입력해 주세요 ***");
		while(true) {
			System.out.print("* 성명입력: ");
			String name = s1.nextLine();
			
			System.out.print("* 학번입력: ");
			int stuID = s2.nextInt();
			
			System.out.print("* 계속해서 다음 학생의 성적을 입력하시겠습니까?(Y/N): ");
			String msg = s1.nextLine();
			if(msg.equals("N") || msg.equals("n"))
				break;
		}
		
		s1.close();
		s2.close();
	}

}

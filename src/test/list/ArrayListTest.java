package test.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		// String형의 자료를 저장할 수 있는 ArrayList객체를 생성.
		ArrayList<String> namesList = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("* 성명입력: ");
			String name = s.nextLine();
			namesList.add(name);
			System.out.print("* 성명을 계속 입력하시겠습니까(Y/N): ");
			String msg = s.nextLine();
			if(msg.equals("n") || msg.equals("N"))
				break;
		}
		
		// ArrayList에 저장된 문자열들을 출력해본다.
		for(int i = 0; i < namesList.size(); i++) {
			System.out.println("== ArrayList nameList에 저장된 내용 출력 == ");
			System.out.println(namesList.get(i));
		}
		
		s.close();
	}

}

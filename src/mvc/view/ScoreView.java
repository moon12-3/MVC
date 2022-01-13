package mvc.view;

import java.util.ArrayList;
import mvc.vo.StudentVO;

public class ScoreView {
	
	private ArrayList<StudentVO> studentArrList;
	
	public ScoreView(ArrayList<StudentVO> studentArrList) {
		this.studentArrList = studentArrList;
		
	}
	
	public void print() {
		System.out.println("====== 전체 학생 성적 정보 출력 ======");
		for(int i = 0 ; i<studentArrList.size(); i++) {
			StudentVO s = studentArrList.get(i);
			int sum = calcSum(s);
			System.out.printf("* %d  %s  %d  %d  %d  %d  %d  합계:%d  평균:%.2f \n",
								s.getStuID(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getScience(), s.getHistory(),
								sum, calcAvg(sum));
		}
	}
	
	public int calcSum(StudentVO s) {
		return s.getKor()+s.getEng()+s.getMath()+s.getScience()+s.getHistory();
	}
	
	public double calcAvg(int sum) {
		return (double)sum/5;
	}
}

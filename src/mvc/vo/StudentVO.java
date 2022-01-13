package mvc.vo;

public class StudentVO {
	private String name;
	private int stuID;
	private int kor, eng, math, science, history;
	
	public StudentVO(String name, int stuID, int kor, int eng, int math, int science, int history) {
		this.name = name;
		this.stuID = stuID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.history = history;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}
	
	
}

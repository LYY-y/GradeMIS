package gdut.imis.entity;

public class LiteratureStu extends Student{
	private double speechGrade;	//文学系学生的演讲成绩
	private double work;	//文学系学生的作品成绩
	
	public LiteratureStu() {
	}

	public LiteratureStu(String no, String name, int age, Sex sex, String depart, int midGrade, int finalGrade,
			double speechGrade, double work) {
		super(no, name, age, sex, depart, midGrade, finalGrade);
		if(checkGrade(speechGrade,work)) {
			this.speechGrade = speechGrade;
			this.work = work;
		}
	}

	public double getSpeechGradeL() {
		return speechGrade;
	}

	public void setSpeechGradeL(double speechGrade) {
		if(checkGrade(speechGrade)) {
			this.speechGrade = speechGrade;
		}
	}

	public double getWork() {
		return work;
	}



	public void setWork(double work) {
		if(checkGrade(work)) {
			this.work = work;
		}
	}

	@Override
	public double CountGrade() {
		return 0.35*speechGrade+0.35*work+0.15*getMidGrade()+0.15*getFinalGrade();
	}

	@Override
	public String getInfo() {
		return super.getInfo()+speechGrade+"#"+work;
	}
	
	
}

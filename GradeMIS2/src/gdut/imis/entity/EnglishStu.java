package gdut.imis.entity;

public class EnglishStu extends Student {
	private double speechGrade;	//定义英语类学生特有演讲成绩
	
	
	public EnglishStu() {
	}

//	public EnglishStu(String no, String name, int age, Sex sex, String depart, int midGrade, int finalGrade,
//			double speechGrade) {
//		super(no, name, age, sex, depart, midGrade, finalGrade);
//		if(checkGrade(speechGrade)) {
//			this.speechGrade = speechGrade;
//		}
//	}

//	public double getSpeechGrade() {
//		return speechGrade;
//	}
//
//	public void setSpeechGrade(double speechGrade) {
//		if(checkGrade(speechGrade)) {
//			this.speechGrade = speechGrade;			
//		}
//	}

	@Override
	public double countGrade() {	//按照英语系综合成绩测评方法
		return 0.5*speechGrade+0.25*getFinalGrade()+0.25*getMidGrade();
	}

//	@Override
//	public String getInfo() {
//		return super.getInfo()+speechGrade;
//	}

	
}

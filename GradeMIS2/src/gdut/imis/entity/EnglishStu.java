package gdut.imis.entity;

public class EnglishStu extends Student {
	private double speechGrade;	//����Ӣ����ѧ�������ݽ��ɼ�
	
	
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
	public double countGrade() {	//����Ӣ��ϵ�ۺϳɼ���������
		return 0.5*speechGrade+0.25*getFinalGrade()+0.25*getMidGrade();
	}

//	@Override
//	public String getInfo() {
//		return super.getInfo()+speechGrade;
//	}

	
}

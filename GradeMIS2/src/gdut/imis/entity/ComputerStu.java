//package gdut.imis.entity;
//
//public class ComputerStu extends Student{
//	private double operateGrade;	//定义计算机系学生的操作能力成绩
//	private double writingGrade;	//定义计算机系学生的英语写作能力成绩
//	
//	public ComputerStu(String no, String name, int age, Sex sex, String depart, int midGrade, int finalGrade,
//			double operateGrade, double writingGrade) {
//		super(no, name, age, sex, depart, midGrade, finalGrade);
//		if(checkGrade(operateGrade,writingGrade)) {
//			this.operateGrade = operateGrade;
//			this.writingGrade = writingGrade;
//		}
//	}
//
//	public ComputerStu() {
//	}
//	
//	
//	public double getOperateGrade() {
//		return operateGrade;
//	}
//
//	public void setOperateGrade(double operateGrade) {
//		if(checkGrade(operateGrade)) {
//			this.operateGrade = operateGrade;			
//		}
//	}
//
//	public double getWritingGrade() {
//		return writingGrade;
//	}
//
//	public void setWritingGrade(double writingGrade) {
//		if(checkGrade(writingGrade)) {
//			this.writingGrade = writingGrade;			
//		}
//	}
//
//	@Override
//	public double CountGrade() {
//		return 0.4*operateGrade+0.2*writingGrade+0.2*getMidGrade()+0.2*getFinalGrade();
//	}
//
//	@Override
//	public String getInfo() {
//		// TODO Auto-generated method stub
//		return super.getInfo()+operateGrade+"#"+writingGrade;
//	}
//	
//	
//}

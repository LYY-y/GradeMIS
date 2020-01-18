package gdut.imis.entity;

import gdut.imis.common.IllegalGradeException;

public abstract class Student {
	private String no;	//定义学生的学号
	private String name;	//定义学生的姓名
	private int age;	//定义学生的年龄
	private Sex sex;	//定义学生的性别
	private String depart;	//定义学生的系别
	private double midGrade;	//定义学生的期中成绩
	private double finalGrade;	//定义学生的期末成绩
	public Student() {}
	public Student(String no, String name, int age, Sex sex, String depart, int midGrade, int finalGrade) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.depart = depart;
		if(checkGrade(midGrade,finalGrade)) {
			this.midGrade = midGrade;
			this.finalGrade = finalGrade;
		}
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public double getMidGrade() {
		return midGrade;
	}
	public void setMidGrade(double midGrade) {
		if(checkGrade(midGrade)) {
			this.midGrade = midGrade;
		}
	}
	public double getFinalGrade() {
		return finalGrade;
	}
	public void setFinalGrade(double finalGrade) {
		if(checkGrade(finalGrade)) {
			this.finalGrade = finalGrade;			
		}
	}
	
	public String getInfo() {	//文件输出记录
		return depart+"#"+no+"#"+name+"#"+age+"#"+sex+"#"+midGrade+"#"+finalGrade+"#";
	}
	
	public abstract double CountGrade();
	
	public boolean checkGrade(double...grades) {	//检查成绩合理性
		for(double grade : grades) {
			try {
				if(grade<0||grade>100) {
					throw new IllegalGradeException();
				}
			}catch(IllegalGradeException e) {
				System.out.println(e.getMessage());
				return false;
			}
		}
		return true;
	}
}

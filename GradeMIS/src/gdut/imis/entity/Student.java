package gdut.imis.entity;

import gdut.imis.common.IllegalGradeException;

public abstract class Student {
	private String no;	//����ѧ����ѧ��
	private String name;	//����ѧ��������
	private int age;	//����ѧ��������
	private Sex sex;	//����ѧ�����Ա�
	private String depart;	//����ѧ����ϵ��
	private double midGrade;	//����ѧ�������гɼ�
	private double finalGrade;	//����ѧ������ĩ�ɼ�
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
	
	public String getInfo() {	//�ļ������¼
		return depart+"#"+no+"#"+name+"#"+age+"#"+sex+"#"+midGrade+"#"+finalGrade+"#";
	}
	
	public abstract double CountGrade();
	
	public boolean checkGrade(double...grades) {	//���ɼ�������
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

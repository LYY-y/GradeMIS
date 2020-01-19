package gdut.imis.entity;

import gdut.imis.common.IllegalGradeException;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public abstract class Student {
	private final StringProperty no;	//定义学生的学号
	private final StringProperty name;	//定义学生的姓名
	private final StringProperty age;	//定义学生的年龄
	private final StringProperty sex;	//定义学生的性别
	private final StringProperty depart;	//定义学生的系别
	private final DoubleProperty midGrade;	//定义学生的期中成绩
	private final DoubleProperty finalGrade;//定义学生的期末成绩
	public Student(StringProperty no, StringProperty name, StringProperty age, StringProperty sex, StringProperty depart,
			DoubleProperty midGrade, DoubleProperty finalGrade) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.depart = depart;
		this.midGrade = midGrade;
		this.finalGrade = finalGrade;
	}
	public Student() {
		this(null, null, null, null, null, null, null);
	}
	public String getNo() {
		return no.get();
	}
	public String getName() {
		return name.get();
	}
	public String getAge() {
		return age.get();
	}
	public String getSex() {
		return sex.get();
	}
	public String getDepart() {
		return depart.get();
	}
	public Double getMidGrade() {
		return midGrade.get();
	}
	public Double getFinalGrade() {
		return finalGrade.get();
	}
	
	public void setNo(String no) {
        this.no.set(no);
    }
	public void setName(String name) {
        this.name.set(name);
    }
	public void setAge(String age) {
        this.age.set(age);
    }
	public void setSex(String sex) {
        this.sex.set(sex);
    }
	public void setDepart(String depart) {
        this.depart.set(depart);
    }
	public void setMidGrade(Double midGrade) {
        this.midGrade.set(midGrade);
    }
	
	public void setFinalGrade(Double finalGrade) {
        this.finalGrade.set(finalGrade);
    }

	public StringProperty noProperty() {
        return no;
    }
	
	public StringProperty nameProperty() {
        return name;
    }
	
	public abstract double countGrade();
}
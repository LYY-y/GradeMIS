package gdut.imis.service;

import java.util.ArrayList;

import gdut.imis.entity.Student;

public interface ImpGrade {
	boolean add(Student stu);	//新增学生记录
	boolean delete(String no);	//删除学生记录
	boolean update(Student stu);	//修改学生记录
	Student findByno(String no);	//基于学生学号查询学生
	ArrayList<Student> findByname(String name);	//基于学生姓名查询学生
	ArrayList<Student> findSome(String depart, double low, double upper);
	ArrayList<Student> sortByGrade(String depart);
	void save();
}

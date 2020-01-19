package gdut.imis.service;

import java.util.ArrayList;

import gdut.imis.entity.Student;

public interface ImpGrade {
	boolean add(Student stu);	//����ѧ����¼
	boolean delete(String no);	//ɾ��ѧ����¼
	boolean update(Student stu);	//�޸�ѧ����¼
	Student findByno(String no);	//����ѧ��ѧ�Ų�ѯѧ��
	ArrayList<Student> findByname(String name);	//����ѧ��������ѯѧ��
	ArrayList<Student> findSome(String depart, double low, double upper);
	ArrayList<Student> sortByGrade(String depart);
	void save();
}

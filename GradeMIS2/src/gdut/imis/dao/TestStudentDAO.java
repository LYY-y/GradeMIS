package gdut.imis.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gdut.imis.entity.ComputerStu;
import gdut.imis.entity.EnglishStu;
import gdut.imis.entity.Sex;
import gdut.imis.entity.Student;

class TestStudentDAO {
//����write����
//	Student[] stuList =  new Student[2];
	

//	@BeforeEach
//	void setUp() throws Exception {
//		stuList[0]=new EnglishStu("1001", "��һ", 15, Sex.Ů, "Ӣ��ϵ", 99, 98, 99);
//		stuList[1]=new ComputerStu("1002", "���", 18, Sex.��, "�����ϵ", 99, 98, 99,87);	
//	}

//	@Test
//	void testWrite() {
//		StudentDAO.write(stuList);
//	}
//����read����	
	@Test
	void testRead() {
		ArrayList<Student> sl=StudentDAO.read();
		for(Student stu:sl) {
			System.out.println(stu.getName()+"\t"+stu.getNo()+"\t"+stu.CountGrade());
		}
	}

}

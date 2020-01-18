package gdut.imis;

import gdut.imis.entity.ComputerStu;
import gdut.imis.entity.EnglishStu;
import gdut.imis.entity.Sex;
import gdut.imis.entity.Student;
import gdut.imis.service.GradeService;

public class MainTest {
	public static void main(String[] args) {
		GradeService gs = new GradeService();
		//Student student = new EnglishStu("1003", "林二", 15, Sex.女, "英语系", 89, 68, 99);
		
		Student student = new ComputerStu("1008", "张伍", 23, Sex.男, "计算机系", 60, 88, 88,87);
		//gs.add(student);
		//gs.findByname("张伍");
		//gs.sortByGrade("计算机系");
		gs.findSome("计算机系", 80, 90);
		gs.save();
	}
}

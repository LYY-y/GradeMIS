package gdut.imis;

import gdut.imis.entity.ComputerStu;
import gdut.imis.entity.EnglishStu;
import gdut.imis.entity.Sex;
import gdut.imis.entity.Student;
import gdut.imis.service.GradeService;

public class MainTest {
	public static void main(String[] args) {
		GradeService gs = new GradeService();
		//Student student = new EnglishStu("1003", "�ֶ�", 15, Sex.Ů, "Ӣ��ϵ", 89, 68, 99);
		
		Student student = new ComputerStu("1008", "����", 23, Sex.��, "�����ϵ", 60, 88, 88,87);
		//gs.add(student);
		//gs.findByname("����");
		//gs.sortByGrade("�����ϵ");
		gs.findSome("�����ϵ", 80, 90);
		gs.save();
	}
}
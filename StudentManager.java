
public class StudentManager {
	
	public void LoginStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ��renci sisteme giri� yapm��t�r...");
		
	}
	
	public void DeleteStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ��renci sistemden silinmi�tir...");
		
	}
	
	public void DetailStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ��rencinin ebeveyn telefon numaras�: "
				+ student.getParentNumber() + " 'dir. ��rencinin cinsiyeti: " + student.getGender());
	}
}

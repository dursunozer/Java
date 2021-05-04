
public class InstructorManager extends UserManager {
	public void LoginInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli eðitmen "
	+ instructor.getCategory() + " dersi vermektedir." );
	}
	
	public void UpdateInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + "isimli eðitmen artýk " + 
	instructor.getCategory() + " dersleri de vermeye baþlamýþtýr, iyi çalýþmalar...");
	}
	
	public void DeleteInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli eðitmen, bundan sonra " + 
	instructor.getCategory() + " dersleri vermeyecektir...");
	}
	
	public void DetailInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli eðitmenin iletiþim bilgileri: "
				+ instructor.getContactinfo() + " 'dir. Yaptý: " + instructor.getAge() + " 'dir."
				+ "Eðitim verdiði alan ise " + instructor.getCategory() + " 'dir.");
	}

}

package kodlamaIoHomework;

public class StudentManager extends UserManager{
	@Override
	public void signUp(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Bu ��renci siteye kay�t oldu");
	}
	
	public void enterLesson(Student user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Bu ��renci derse kay�t oldu");
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Bu ��renci " + user.getTotalLesson() + " Derse kay�tl�");
	}
}

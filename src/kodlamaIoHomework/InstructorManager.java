package kodlamaIoHomework;

public class InstructorManager extends UserManager{
	@Override
	public void signUp(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Bu i�veren siteye kay�t oldu");
	}
	
	public void addLesson(Instructor user , String[] givenLessonsName) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Ders ekledi");
		user.setGivenLessonsName(givenLessonsName);
		for (String lesson : givenLessonsName) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " Ki�isinin dersleri " + lesson);
		}
		
	}
	
	public void writeCompanyName(Instructor user) {
		System.out.println(user.getFirstName() + " Ki�isinin �al��t��� �irket ismi: " + user.getCompanyName());
	}
}

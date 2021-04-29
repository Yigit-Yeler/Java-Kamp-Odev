package kodlamaIoHomework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student yigit = new Student();
		yigit.setId(0);
		yigit.setFirstName("Yi�it");
		yigit.setLastName("Yeler");
		yigit.setTotalLesson(yigit.getTotalLesson()+1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.signUp(yigit);
		studentManager.enterLesson(yigit);
		
		Instructor EnginHoca = new Instructor();
		EnginHoca.setId(1);
		EnginHoca.setFirstName("Engin");
		EnginHoca.setLastName("Demiro�");
		EnginHoca.setCompanyName("Yaz�l�mc�");
		
		String[] givenLessonsName = {"Java-React" , "C#"};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signUp(EnginHoca);
		instructorManager.addLesson(EnginHoca,givenLessonsName);
	}

}

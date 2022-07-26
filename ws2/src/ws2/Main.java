package ws2;

public class Main {

	public static void main(String[] args) {
		  Instructor instructor1 = new Instructor(1, "Engin Demiroğ");

	        
	        Course course1 = new Course(1, "JavaScript", "JavaScript Dersleri", instructor1);
	        
	        Course course2 = new Course(2, "Programlamaya Giriş", "PTG Dersleri", instructor1);
	        
	        Course course3 = new Course(3, "C#", "C# Dersleri", instructor1);
	        
	        Course course4 = new Course(4, "Java", "Java Dersleri", instructor1);

	        
	        
	        Course[] courses = {course1, course2, course3};
	        
	        for (Course course : courses) {
	            System.out.println(course.getName());
	        }
	        System.out.println(courses.length);
	        
	        
	        CourseService courseService = new CourseService();
	        courseService.add(course2);    
	        
	        InstructorService instructorService = new InstructorService();
	        instructorService.add(instructor1);

	}

}

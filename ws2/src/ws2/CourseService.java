package ws2;
import java.util.*;

public class CourseService {
	 public void add(Course course) {
	        System.out.println(course.getName() + " eklendi.");
	    }

	    public void update(Course course) {
	        System.out.println(course.getName() + " güncellendi.");
	    }

	    public void delete(Course course) {
	        System.out.println(course.getName() + " silindi.");
	    }

	    public List<Course> getAll(){
	        return new ArrayList<Course>();
	
}
}

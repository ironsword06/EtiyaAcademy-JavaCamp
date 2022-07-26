package ws2;
import java.util.*;
public class InstructorService {
	public void add(Instructor instructor) {
        System.out.println(instructor.getName() + " eklendi.");
    }
    
    public void update(Instructor instructor) {
        System.out.println(instructor.getName() + " güncellendi.");
    }
    
    public void delete(Instructor instructor) {
        System.out.println(instructor.getName() + " silindi.");
    }
    
    public List<Instructor> getAll() {
        return new ArrayList<Instructor>();
    }

}

package ws2;

public class Course {
	   private int id;
	    private String name;
	    private String description;
	    private Instructor instructor;

	    public Course() {
	        System.out.println("Yapıcı Blok..Constructor..");
	    }

	    public Course(int id, String name, String description, Instructor instructor) {
	        this();    //üstteki boş constructor da çalışır
	        this.id = id; //this yukarıdaki class demek
	        this.name = name;
	        this.description = description;
	        this.instructor = instructor;
	    }




	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getDescription() {
	        return description;
	    }
	    public void setDescription(String description) {
	        this.description = description;
	    }
	    public Instructor getInstructor() {
	        return instructor;
	    }
	    public void setInstructor(Instructor instructor) {
	        this.instructor = instructor;
}
}

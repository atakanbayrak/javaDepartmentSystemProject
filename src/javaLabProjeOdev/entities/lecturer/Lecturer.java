package javaLabProjeOdev.entities.lecturer;

import java.util.List;

import javaLabProjeOdev.entities.course.Course;

public class Lecturer {

    // Lecturer class variables

    private String lecturerId;
    private String lecturerName;
    private String lecturerSurname;
    private List<Course> lecturerCourses;
    private int courseQuantity;

    // Lecturer class constructor
    public Lecturer(String lecturerId, String lecturerName, String lecturerSurname) {
        this.lecturerId = lecturerId;
        this.lecturerName = lecturerName;
        this.lecturerSurname = lecturerSurname;
        
    }
    
    public Lecturer() {
       
    }
    
    // Lecturer class gets and sets
	public String getLecturerId() {
		return lecturerId;
	}

	public void setLecturerId(String lecturerId) {
		this.lecturerId = lecturerId;
	}

	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public String getLecturerSurname() {
		return lecturerSurname;
	}

	public void setLecturerSurname(String lecturerSurname) {
		this.lecturerSurname = lecturerSurname;
	}

	public List<Course> getLecturerCourses() {
		return lecturerCourses;
	}

	public void setLecturerCourses(List<Course> lecturerCourses) {
		this.lecturerCourses = lecturerCourses;
	}

	public int getCourseQuantity() {
		return courseQuantity;
	}

	public void setCourseQuantity(int courseQuantity) {
		this.courseQuantity = courseQuantity;
	}

	

    
}


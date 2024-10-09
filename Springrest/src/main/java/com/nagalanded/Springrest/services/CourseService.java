/*package com.nagalanded.Springrest.services;



import java.util.*;

import com.nagalanded.Springrest.entities.Course;

public interface CourseService {

	public List<Course>getCourse();
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	public void deleteCourse(long parseLong);
	
	
}*/
package com.nagalanded.Springrest.services;

import java.util.List;
import com.nagalanded.Springrest.entities.Course;

public interface CourseService {

    public List<Course> getCourses();
    
    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(long courseId);
}

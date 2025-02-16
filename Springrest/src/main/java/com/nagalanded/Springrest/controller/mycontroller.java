package com.nagalanded.Springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagalanded.Springrest.entities.Course;
import com.nagalanded.Springrest.services.CourseService;


@RestController
public class mycontroller {
	
	@Autowired
	private  CourseService courseService;
@GetMapping("/home")
public String home(){
	
	return "welcome to courses Application";
   }
@GetMapping("/courses")

//get the courses
public List<Course>getCourses(){
	return this.courseService.getCourses();
}
@GetMapping("/courses/{courseId}")
public Course getCourse(@PathVariable String courseId) {
	return this.courseService.getCourse(Long.parseLong(courseId));



}
//add course
@PostMapping("/courses")
public Course addCourse(@RequestBody Course course) {
	return this.courseService.addCourse(course);
}
// update course using put request
@PutMapping("/courses")
public Course updateCourse(@RequestBody Course course ) {
	return this.courseService.updateCourse(course);
}
// Delete the course
@DeleteMapping("/courses/{courseId}")
public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String courseId){
	try {
		this.courseService.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
}

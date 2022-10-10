package business;

import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	
	public CourseManager(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	
	public void add(Course course) {
		courseDao.add(course);
	}
	
	public void delete(Course course) {
		courseDao.delete(course);
	}
	
}

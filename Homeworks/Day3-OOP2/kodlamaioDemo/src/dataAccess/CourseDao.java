package dataAccess;

import entities.Course;

public interface CourseDao {
	void add(Course course);
	void delete(Course course);
}

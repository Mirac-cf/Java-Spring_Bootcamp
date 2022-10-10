import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.category.HibernateCategoryDao;
import dataAccess.course.HibernateCourseDao;
import dataAccess.course.JdbcCourseDao;
import dataAccess.instructor.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
	public static void main(String[] args) {
		CourseManager courseManager = new CourseManager(new JdbcCourseDao());
		Course course1 = new Course("Java",50);
		Course course2 = new Course("Python",-2);
		courseManager.add(course1);
		courseManager.add(course2);
		
		System.out.println("----------------------------------------");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
		Category category = new Category("Programlama");
		categoryManager.add(category);
		categoryManager.delete(category);
		
		System.out.println("----------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao());
		Instructor instructor = new Instructor("Engin Demirog");
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		
		System.out.println("----------------------------------------");
		
		
		
	}
}

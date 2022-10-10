package dataAccess.course;

import dataAccess.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		if(course.getFiyat()<0) {
			System.out.println("Kurs fiyati 0'in altinda olamaz "+course.getName()+" kursu veritabanina EKLENMEDI");
		}else 
			System.out.println(course.getName() + " kursu Hibernate ile veri tabanina eklendi.   fiyati: " + course.getFiyat());
	}

	@Override
	public void delete(Course course) {
		System.out.println(course.getName() + " kursu basariyla Hibernate ile veritabanindan silindi...");
	}
	
}

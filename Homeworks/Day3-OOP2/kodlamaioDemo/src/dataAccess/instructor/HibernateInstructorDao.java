package dataAccess.instructor;

import dataAccess.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("egitmen: " +instructor.getName()+" Hibernate ile basariyla eklendi");
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("egitmen: "+instructor.getName()+ " Hibernate ile basariyla SILINDI" );
	}

}

package dataAccess.instructor;

import dataAccess.InstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("egitmen: " +instructor.getName()+" Jdbc ile basariyla eklendi");
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("egitmen: "+instructor.getName()+ " Jdbc ile basariyla SILINDI" );
	}
	
}

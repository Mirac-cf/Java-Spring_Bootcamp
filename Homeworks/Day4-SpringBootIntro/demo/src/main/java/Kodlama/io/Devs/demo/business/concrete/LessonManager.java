package Kodlama.io.Devs.demo.business.concrete;

import java.util.List;
import org.springframework.stereotype.Service;
import Kodlama.io.Devs.demo.business.abstracts.LessonService;
import Kodlama.io.Devs.demo.dataAccess.abstracts.ILessonDal;
import Kodlama.io.Devs.demo.entities.Lessons;

@Service
public class LessonManager implements LessonService{
	
	private ILessonDal lessonDal;
	
	
	public LessonManager(ILessonDal lessonDal) {
		this.lessonDal = lessonDal;
	}

	@Override
	public List<Lessons> getAll() {
		return lessonDal.getAll();
	}

	@Override
	public void delete(int id) {
		lessonDal.delete(id);
	}

	@Override
	public void add(Lessons lesson) {
		if(benzerlikKontrol(lesson) && boslukkontrol(lesson)) {
			lessonDal.add(lesson);
		}
	}

	@Override
	public void update(Lessons lesson) {
		if(benzerlikKontrol(lesson) && boslukkontrol(lesson)) {
			lessonDal.update(lesson);
		}
	}

	@Override
	public Lessons getbyid(int id) {
	 	return lessonDal.getbyid(id);
	}
	
	
	public boolean benzerlikKontrol(Lessons lesson) {
		boolean control = true;
		
		for (Lessons lessons : lessonDal.getAll()) {
			if(lesson.getName().equalsIgnoreCase(lessons.getName())) {
				control = false;
			}
		}	
		
		return control;
	}
	
	
	public boolean boslukkontrol(Lessons lessons) {
		boolean control = true;
		
		if(lessons.getName().trim().equals("")) {
			control = false;
		}
		
		return control;
	}
	
	
}

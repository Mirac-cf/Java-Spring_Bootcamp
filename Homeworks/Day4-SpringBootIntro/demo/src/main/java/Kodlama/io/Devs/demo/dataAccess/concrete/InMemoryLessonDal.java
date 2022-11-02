package Kodlama.io.Devs.demo.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.demo.dataAccess.abstracts.ILessonDal;
import Kodlama.io.Devs.demo.entities.Lessons;

@Repository
public class InMemoryLessonDal implements ILessonDal{

	List<Lessons> dersler;
	
	public InMemoryLessonDal() {
		dersler = new ArrayList<Lessons>();
		dersler.add(new Lessons(1,"Python"));
		dersler.add(new Lessons(2,"Java"));
		dersler.add(new Lessons(3,"C#"));
	}


	@Override
	public List<Lessons> getAll() {
		return dersler;
	}

	@Override
	public void delete(int id) {
		for (Lessons lessons : dersler) {
			if(lessons.getId() == id) {
				dersler.remove(lessons);
				break;
			}
		}
	}

	@Override
	public void add(Lessons lesson) {
		dersler.add(lesson);
	}

	@Override
	public void update(Lessons lesson) {
		for (Lessons lessons : dersler) {
			if(lessons.getId() == lesson.getId()) {
				lessons.setName(lesson.getName());
			}
		}
	}


	@Override
	public Lessons getbyid(int id) {
		for (Lessons lessons : dersler) {
			if(lessons.getId() == id) {
				return lessons;
			}
		}
		return null;
	}

}

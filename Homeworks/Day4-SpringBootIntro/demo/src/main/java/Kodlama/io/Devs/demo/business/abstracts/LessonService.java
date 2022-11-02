package Kodlama.io.Devs.demo.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.demo.entities.Lessons;

public interface LessonService {
	public List<Lessons> getAll();
	public void delete(int id);
	public void add(Lessons lesson);
	public void update(Lessons lesson);
	public Lessons getbyid(int id);
	
	
}

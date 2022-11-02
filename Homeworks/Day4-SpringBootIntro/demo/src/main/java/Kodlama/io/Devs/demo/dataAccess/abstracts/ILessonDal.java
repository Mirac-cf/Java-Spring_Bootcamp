package Kodlama.io.Devs.demo.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.demo.entities.Lessons;


public interface ILessonDal {
	public Lessons getbyid(int id);
	public List<Lessons> getAll();
	public void delete(int id);
	public void add(Lessons lesson);
	public void update(Lessons lesson);
	
}

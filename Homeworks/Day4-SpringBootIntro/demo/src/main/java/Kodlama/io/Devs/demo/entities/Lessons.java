package Kodlama.io.Devs.demo.entities;

public class Lessons {
	private int id;
	private String name;
	
	public Lessons() {
	}
	
	public Lessons(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}

package entities;

public class Course {
	private String name;
	private int fiyat;
	
	public Course(String name, int fiyat) {
		this.name = name;
		this.fiyat = fiyat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
}

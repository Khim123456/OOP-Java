package bai6;

public abstract class Person {
	protected String name;
	protected char gender;
	protected int age;
	
	public Person() {}
	
	public Person(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//Phuong thuc truu tuong de nhap du lieu
	public abstract void inputData();
	
	@Override
	public String toString() {
		return "Name: "+name+", Gender: "+gender+", Age: "+age;
	}

}

package crime_management;

public abstract class Person {
	protected int id;
	protected String name;
	protected int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public abstract String getDetails();
}

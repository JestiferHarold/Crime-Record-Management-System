package crime_management;

public class Suspect extends Person{
	private String address;
	
	public Suspect(int id, String name, int age, String address) {
		super(id, name, age);
		this.address = address;
	}
	
	@Override
	public String getDetails() {
		return "Suspect ID: " + id + "\nName: " + name + "\nAge: " + age + "\nAddress: " + address;
	}

}

package crime_management;

public class Officer extends Person {
	private String rank;
	
	public Officer(int id, String name, int age, String rank) {
		super(id, name, age);
		this.rank = rank;
	}
	
	@Override
	public String getDetails() {
		return "Officer ID: " + id + "\nName: " + name + "\nRank: " + rank;
	}
}

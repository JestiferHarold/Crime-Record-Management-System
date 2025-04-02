package crime_management;

public class Crime implements CrimeInterface {
	private int id;
	private String type;
	private String location;
	private String description;
	
	public Crime(int id, String type, String location, String description) {
		this.id = id;
		this.type = type;
		this.location = location;
		this.description = description;
	}
	
	@Override
	public String getDetails() {
		return "Crime ID: " + id + "\nType: " + type + "\nLocation: " + location + "\nDescription: " + description;
	}
}

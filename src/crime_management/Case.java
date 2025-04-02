package crime_management;

import java.util.ArrayList;
import java.util.List;

public class Case {
	private int caseId;
	private Crime crime;
	private List<Suspect> suspects;
	private Officer officer;
	
	public Case(int caseId, Crime crime, Officer officer) {
		this.caseId = caseId;
		this.crime = crime;
		this.officer = officer;
		this.suspects = new ArrayList<>();
	}
	
	public void addSuspect(Suspect suspect) {
		suspects.add(suspect);
	}
	
	public String getDetails() {
		StringBuilder details = new StringBuilder("Case ID: " + caseId + "\nCrime Details: " + crime.getDetails() + "\nOfficer in Charge: " + officer.getDetails() + "\nSuspects:\n");
		for (Suspect s : suspects) {
			details.append(s.getDetails()).append("\n");
		}
		return details.toString();
	}
}

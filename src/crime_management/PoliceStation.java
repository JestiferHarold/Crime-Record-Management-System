package crime_management;

import java.util.*;

public class PoliceStation {
		
	Scanner scanner = new Scanner(System.in);
//	private static Scanner scanner = new Scanner(System.in);
    private List<Crime> crimes = new ArrayList<>();
    private List<Officer> officers = new ArrayList<>();
    private List<Suspect> suspects = new ArrayList<>();
    private List<Case> cases = new ArrayList<>();

	public void addCrime() {
		System.out.print("Enter Crime ID: ");
		int id = scanner.nextInt(); scanner.nextLine();
		System.out.print("Enter Crime Type: ");
		String type = scanner.next();
		System.out.print("Enter Crime Location: ");
		String location = scanner.next();
		System.out.print("Enter Crime Description: ");
        String description = scanner.next();
        crimes.add(new Crime(id, type, location, description));
        System.out.print("Crime Added Successfully!");
    }

    public void addOfficer() {
        System.out.print("Enter Officer ID: "); scanner.nextLine();
        int id = scanner.nextInt(); scanner.nextLine();
        System.out.print("Enter Officer Name: ");
        String name = scanner.next();
        System.out.print("Enter Officer Age: ");
        int age = scanner.nextInt(); scanner.nextLine();
        System.out.print("Enter Officer Rank: ");
        String rank = scanner.next();
        officers.add(new Officer(id, name, age, rank));
        System.out.println("Officer Added Successfully!");
    }

    public void addSuspect() {
        System.out.print("Enter Suspect ID: ");
        int id = scanner.nextInt(); scanner.nextLine();
        System.out.print("Enter Suspect Name: ");
        String name = scanner.next();
        System.out.print("Enter Suspect Age: ");
        int age = scanner.nextInt(); scanner.nextLine();
        System.out.print("Enter Suspect Address: ");
        String address = scanner.next();
        suspects.add(new Suspect(id, name, age, address));
        System.out.println("Suspect Added Successfully!");
    }

    public void createCase() {
        if (crimes.isEmpty() || officers.isEmpty()) {
            System.out.println("Ensure at least one Crime and Officer exist!");
            return;
        }
        System.out.print("Enter Case ID: ");
        int caseId = scanner.nextInt(); scanner.nextLine();
        Case newCase = new Case(caseId, crimes.get(0), officers.get(0));
        for (Suspect suspect : suspects) {
            newCase.addSuspect(suspect);
        }
        cases.add(newCase);
        System.out.println("Case Created Successfully!");
    }

    public void viewCases() {
        for (Case c : cases) {
            System.out.println(c.getDetails());
        }
        if (cases.isEmpty()) {
        	System.out.println("No Cases Filed!");
        }
    }
}

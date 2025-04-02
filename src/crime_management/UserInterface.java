package crime_management;

import java.util.*;

public class UserInterface {
	
	private static Scanner scanner = new Scanner(System.in);
    private static PoliceStation station = new PoliceStation();

    public static void start() {
        System.out.println("Welcome to Crime Management System");
        int choice;
        do {
            System.out.println("\n1. Add Crime\n2. Add Officer\n3. Add Suspect\n4. Create Case\n5. View Cases\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1 -> station.addCrime();
                case 2 -> station.addOfficer();
                case 3 -> station.addSuspect();
                case 4 -> station.createCase();
                case 5 -> station.viewCases();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }
    
}

package crime_management;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PoliceStationTest {
    private PoliceStation station;

    @BeforeEach
    void setUp() {
        station = new PoliceStation();
    }

    @Test
    void testAddMultipleCrimes() {
        station.addCrime(1, "Robbery", "Downtown", "Bank robbery");
        station.addCrime(2, "Assault", "Suburb", "Street fight");
        assertEquals(2, station.getCrimes().size());
    }

    @Test
    void testAddDuplicateOfficer() {
        station.addOfficer(101, "John Doe", 35, "Sergeant");
        station.addOfficer(101, "John Doe", 35, "Sergeant"); // Adding duplicate ID
        assertEquals(1, station.getOfficers().size(), "Duplicate officer should not be added.");
    }

    @Test
    void testAddSuspectWithEmptyName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            station.addSuspect(201, "", 28, "Unknown");
        });
        assertEquals("Suspect name cannot be empty", exception.getMessage());
    }

    @Test
    void testCreateMultipleCases() {
        station.addCrime(3, "Burglary", "West Side", "House break-in");
        station.addCrime(4, "Fraud", "City Center", "Online scam");
        station.addOfficer(102, "Alice Brown", 40, "Inspector");
        station.addOfficer(103, "Mike Smith", 45, "Detective");
        
        station.createCase(301);
        station.createCase(302);
        
        assertEquals(2, station.getCases().size(), "Should have created two cases");
    }

    @Test
    void testViewCasesWhenEmpty() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        station.viewCases();
        
        assertTrue(outContent.toString().contains("No Cases Filed!"));
    }
}

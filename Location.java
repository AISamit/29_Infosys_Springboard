package day4;
public class Location {
    public static void main(String[] args) {
        LocationChanger employee1 = new LocationChanger();
        employee1.setName("Annabelle Michael");
        employee1.setLocation("BL003, Delhi, STP");

        LocationChanger employee2 = new LocationChanger();
        employee2.setName("Jissele James");
        employee2.setLocation("FL091, Pune, SEZ");

        employee1.welcomeEmployee();
        employee1.checkCity();
        employee1.editAddress();

        System.out.println();

        employee2.welcomeEmployee();
        employee2.checkCity();
        employee2.editAddress();
    }
}

class LocationChanger {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void welcomeEmployee() {
        String firstName = name.split(" ")[0];
        System.out.println("Hello " + firstName);
    }

    public void checkCity() {
        if (location.contains("Delhi")) {
            System.out.println("Welcome to Infy Mysore Delhites!");
        } else if (location.contains("Trivandrum")) {
            System.out.println("Welcome to Hyoc people of Trinfyll");
        } else if (location.contains("Bhubaneshwar")) {
            System.out.println("You came a long way down South! We welcome you!");
        } else {
            System.out.println("Oops, your city name is not listed!");
        }
    }

    public void editAddress() {
        if (location.contains("STP")) {
            System.out.println("Your location has been changed from STP to SEZ");
        } else if (location.contains("SEZ")) {
            System.out.println("Your location remains the same!");
        }
    }
}
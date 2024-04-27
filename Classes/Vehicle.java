package Classes;

public class Vehicle {
    protected final String serialNumber;
    protected final int noPersons;
    protected String name;

    public Vehicle(String serialNumber, int noPersons) {
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
    }
    public Vehicle(String serialNumber, int noPersons, String name) {
        this(serialNumber, noPersons);
        this.name = name;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }
    public final int getNoPersons() {
        return this.noPersons;
    }
    public boolean goTo(double positionX, double positionY) {
        System.out.println("Error: unknown vehicle cannot move…");
        return false;
    }
    public boolean addFuel(double amount) {
        System.out.println("Error: unknown type of vehicle…");
        return false;
    }
    public void printInfo() {
        System.out.format("Vehicle properties:\n\t- serial number: %s\n\t- capacity: %d persons\n\t- name: %s\n",
                this.serialNumber, this.noPersons, this.name);
    }
}

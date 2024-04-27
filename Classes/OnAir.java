package Classes;

public class OnAir extends Vehicle {
    private int noTurbines = 2;
    private boolean hasFirstClass;

    public OnAir(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
    }
    public OnAir(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
    }
    public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
        this(serialNumber, noPersons, name);
        this.noTurbines = noTurbines;
    }
    public OnAir(String serialNumber, int noPersons, String name, int noTurbines, boolean hasFirstClass) {
        this(serialNumber, noPersons, name, noTurbines);
        this.hasFirstClass = hasFirstClass;
    }

    public int getNoTurbines() {
        return this.noTurbines;
    }
    public boolean isHasFirstClass() {
        return this.hasFirstClass;
    }

    @Override
    public boolean goTo(double positionX, double positionY) {
        System.out.format("Flying the airplane to coordinates: [%f, %f]\n", positionX, positionY);
        return true;
    }

    @Override
    public boolean addFuel(double amount) {
        System.out.format(" Adding %f l of fuel to the airplane\n", amount);
        return true;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        String output = this.hasFirstClass ? "has first class" : "does not have first class";
        System.out.format("Airplane properties:\n\t- number of turbines: %d\n\t- %s\n",
                this.noTurbines, output);
    }
}

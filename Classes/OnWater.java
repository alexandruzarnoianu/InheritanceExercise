package Classes;

public class OnWater extends Vehicle{
    private int noEngines = 2;
    private double cargoCapacity;

    public OnWater(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
    }

    public OnWater(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
    }

    public OnWater(String serialNumber, int noPersons, String name, int noEngines) {
        this(serialNumber, noPersons, name);
        this.noEngines = noEngines;
    }

    public OnWater(String serialNumber, int noPersons, String name, int noEngines, double cargoCapacity) {
        this(serialNumber, noPersons, name, noEngines);
        this.cargoCapacity = cargoCapacity;
    }

    public int getNoEngines() {
        return this.noEngines;
    }

    public double getCargoCapacity() {
        return this.cargoCapacity;
    }

    @Override
    public boolean goTo(double positionX, double positionY) {
        System.out.format("Sailing the vessel to coordinates: [%f, %f]\n", positionX, positionY);
        return true;
    }

    @Override
    public boolean addFuel(double amount) {
        System.out.format("Adding %f l of fuel to the vessel\n", amount);
        return true;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.format("Vessel properties:\n\t- number of engines: %d\n\t- cargo capacity: %f\n",
                this.noEngines, this.cargoCapacity);
    }
}

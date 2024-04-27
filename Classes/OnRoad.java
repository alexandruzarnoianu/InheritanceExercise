package Classes;

public class OnRoad extends Vehicle{
    private int noWheels = 4;
    private int noDoors = 4;

    public OnRoad(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
    }
    public OnRoad(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
    }
    public OnRoad(String serialNumber, int noPersons, String name, int noWheels) {
        this(serialNumber, noPersons, name);
        this.noWheels = noWheels;
    }
    public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors) {
        this(serialNumber, noPersons, name, noWheels);
        this.noDoors = noDoors;
    }

    public int getNoWheels() {
        return this.noWheels;
    }
    public int getNoDoors() {
        return this.noDoors;
    }

    @Override
    public boolean goTo(double positionX, double positionY) {
        System.out.format("Driving the vehicle on road to coordinates: [%f, %f]\n", positionX, positionY);
        return true;
    }
    @Override
    public boolean addFuel(double amount) {
        System.out.format("Adding %f l of fuel to the driving vehicle\n", amount);
        return true;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.format("Driving vehicle properties:\n\t- number of wheels: %d\n\t- number of doors: %d\n",
                this.noWheels, this.noDoors);
    }
}
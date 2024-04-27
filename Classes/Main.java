package Classes;

import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testIdx = scanner.nextInt();
        switch (testIdx) {
            case 1:
                try {
                    if (Modifier.isFinal(Vehicle.class.getDeclaredField("serialNumber").getModifiers())
                            && (Modifier.isFinal(Vehicle.class.getDeclaredField("noPersons").getModifiers()))) {
                        System.out.println("serialNumber and noPersons were properly declared");
                    } else {
                        System.out.println("serialNumber and noPersons should only be set once!");
                    }
                } catch (NoSuchFieldException | SecurityException e) {
                    e.printStackTrace();
                }
                break;

            case 2:
                try {
                    if (Modifier.isFinal(OnRoad.class.getDeclaredField("noWheels").getModifiers())
                            && (Modifier.isFinal(OnRoad.class.getDeclaredField("noDoors").getModifiers()))) {
                        System.out.println("noWheels and noDoors were properly declared");
                    } else {
                        System.out.println("noWheels and noDoors should only be set once!");
                    }

                    if (Modifier.isFinal(OnWater.class.getDeclaredField("noEngines").getModifiers())) {
                        System.out.println("noEngines was properly declared");
                    } else {
                        System.out.println("noEngines should only be set once!");
                    }

                    if (Modifier.isFinal(OnAir.class.getDeclaredField("noTurbines").getModifiers())) {
                        System.out.println("noTurbines was properly declared");
                    } else {
                        System.out.println("noTurbines should only be set once!");
                    }
                } catch (NoSuchFieldException | SecurityException e) {
                    e.printStackTrace();
                }
                break;

            case 3:
                try {
                    Vehicle.class.getConstructor(String.class, int.class);
                    System.out.println("Constructor Vehicle(String, int) found");

                    Vehicle.class.getConstructor(String.class, int.class, String.class);
                    System.out.println("Constructor Vehicle(String, int, String) found");
                } catch (NoSuchMethodException | SecurityException e) {
                    e.printStackTrace();
                }
                break;

            case 4:
                try {
                    OnRoad.class.getConstructor(String.class, int.class);
                    System.out.println("Constructor OnRoad(String, int) found");

                    OnRoad.class.getDeclaredConstructor(String.class, int.class, String.class);
                    System.out.println("Constructor OnRoad(String, int, String) found");

                    OnRoad.class.getDeclaredConstructor(String.class, int.class, String.class, int.class);
                    System.out.println("Constructor OnRoad(String, int, String, int) found");

                    OnRoad.class.getDeclaredConstructor(
                            String.class, int.class, String.class, int.class, int.class);
                    System.out.println("Constructor OnRoad(String, int, String, int, int) found");
                } catch (NoSuchMethodException | SecurityException e) {
                    e.printStackTrace();
                }
                break;

            case 5:
                try {
                    OnWater.class.getConstructor(String.class, int.class);
                    System.out.println("Constructor OnWater(String, int) found");

                    OnWater.class.getDeclaredConstructor(String.class, int.class, String.class);
                    System.out.println("Constructor OnWater(String, int, String) found");

                    OnWater.class.getDeclaredConstructor(String.class, int.class, String.class, int.class);
                    System.out.println("Constructor OnWater(String, int, String, int) found");

                    OnWater.class.getDeclaredConstructor(
                            String.class, int.class, String.class, int.class, double.class);
                    System.out.println("Constructor OnWater(String, int, String, int, double) found");
                } catch (NoSuchMethodException | SecurityException e) {
                    e.printStackTrace();
                }
                break;

            case 6:
                try {
                    OnAir.class.getConstructor(String.class, int.class);
                    System.out.println("Constructor OnAir(String, int) found");

                    OnAir.class.getDeclaredConstructor(String.class, int.class, String.class);
                    System.out.println("Constructor OnAir(String, int, String) found");

                    OnAir.class.getDeclaredConstructor(String.class, int.class, String.class, int.class);
                    System.out.println("Constructor OnAir(String, int, String, int) found");

                    OnAir.class.getDeclaredConstructor(
                            String.class, int.class, String.class, int.class, boolean.class);
                    System.out.println("Constructor OnAir(String, int, String, int, boolean) found");
                } catch (NoSuchMethodException | SecurityException e) {
                    e.printStackTrace();
                }
                break;

            case 7:
                Vehicle v7 = new Vehicle("3FDS9DFF8FSD7", 4, "Moby");
                System.out.println(v7.goTo(22, 23));
                System.out.println(v7.addFuel(100));
                System.out.println(v7.getSerialNumber());
                v7.printInfo();
                break;

            case 8:
                OnRoad v8 = new OnRoad("FDFL8KMFSDLKM6", 2, "Sporty", 4, 2);
                System.out.println(v8.goTo(21.3, 12.88));
                System.out.println(v8.addFuel(28.12));
                System.out.println(v8.getSerialNumber());
                v8.printInfo();
                break;

            case 9:
                OnWater v9 = new OnWater("F8GFDG86D87GGD", 20, "Wavess", 2, 2000);
                System.out.println(v9.goTo(11.8, 4.33));
                System.out.println(v9.addFuel(148.05));
                System.out.println(v9.getSerialNumber());
                v9.printInfo();
                break;

            case 10:
                OnAir v10 = new OnAir("GJR96GDF98DF9ND", 120, "Bluesky", 2, false);
                System.out.println(v10.goTo(41.3, 120.88));
                System.out.println(v10.addFuel(3000.5));
                System.out.println(v10.getSerialNumber());
                v10.printInfo();
                break;
        }
    }
}

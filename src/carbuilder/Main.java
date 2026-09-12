package carbuilder;
import java.util.Scanner;
public final class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        Car everydaySports = director.buildEverydaySportsCar(
                new SportsCarBuilder(), "Toyota", "GR86");
        Car trackSports = director.buildTrackReadySportsCar(
                new SportsCarBuilder(), "Chevrolet", "Corvette");
        Car familySuv = director.buildFamilySuv(
                new SUVCarBuilder(), "Kia", "Sorento");
        Car offRoadSuv = director.buildOffRoadSuv(
                new SUVCarBuilder(), "Toyota", "Land Cruiser");

        System.out.println("--- Built via Director ---");
        System.out.println(everydaySports);
        System.out.println(trackSports);
        System.out.println(familySuv);
        System.out.println(offRoadSuv);

        System.out.println();
        System.out.println("--- Built manually, one-off custom SUV ---");
        Car customSuv = new SUVCarBuilder()
                .setBrand("Hyundai")
                .setModel("Santa Fe")
                .setEngine("Inline-4 Turbo", 235)
                .setTransmission("Automatic")
                .setSeats(7)
                .setColor("Deep Blue")
                .addGps()
                .addSunroof()
                .build();
        System.out.println(customSuv);

        demonstrateValidation();

        System.out.println();
        System.out.println("--- Enter your own car ---");
        buildCarFromUserInput();
    }

    private static void demonstrateValidation() {
        System.out.println();
        System.out.println("--- Guard rails ---");

        try {
            new SportsCarBuilder()
                    .setBrand("Lada")
                    .setModel("Granta")
                    .setEngine("Inline-4", 106)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Rejected underpowered sports car: " + e.getMessage());
        }

        try {
            new SUVCarBuilder().addSportPackage();
        } catch (UnsupportedOperationException e) {
            System.out.println("Rejected unsupported option: " + e.getMessage());
        }
    }
    private static void buildCarFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Car type (sport/suv): ");
        String type = scanner.nextLine().trim().toLowerCase();

        System.out.print("Brand: ");
        String brand = scanner.nextLine().trim();

        System.out.print("Model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Engine type (e.g. V6 Turbo): ");
        String engineType = scanner.nextLine().trim();

        System.out.print("Horsepower: ");
        int horsepower = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Transmission (Manual/Automatic): ");
        String transmission = scanner.nextLine().trim();

        System.out.print("Color: ");
        String color = scanner.nextLine().trim();

        System.out.print("Add GPS? (y/n): ");
        boolean gps = scanner.nextLine().trim().equalsIgnoreCase("y");

        System.out.print("Add sunroof? (y/n): ");
        boolean sunroof = scanner.nextLine().trim().equalsIgnoreCase("y");

        CarBuilder builder = type.equals("suv")
                ? new SUVCarBuilder()
                : new SportsCarBuilder();

        builder.setBrand(brand)
                .setModel(model)
                .setEngine(engineType, horsepower)
                .setTransmission(transmission)
                .setColor(color);

        if (gps) {
            builder.addGps();
        }
        if (sunroof) {
            builder.addSunroof();
        }

        try {
            Car userCar = builder.build();
            System.out.println("Your car: " + userCar);
        } catch (IllegalStateException | UnsupportedOperationException e) {
            System.out.println("Could not build your car: " + e.getMessage());
        }
    }
}

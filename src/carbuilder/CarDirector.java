package carbuilder;
public class CarDirector {

    private static final int SPORTS_HORSEPOWER = 320;
    private static final int TRACK_HORSEPOWER = 500;
    private static final int FAMILY_SUV_HORSEPOWER = 220;
    private static final int OFF_ROAD_SUV_HORSEPOWER = 280;

    public Car buildEverydaySportsCar(CarBuilder builder, String brand, String model) {
        return builder.reset()
                .setBrand(brand)
                .setModel(model)
                .setEngine("V6 Turbo", SPORTS_HORSEPOWER)
                .setTransmission("Automatic")
                .setColor("Red")
                .addGps()
                .build();
    }

    public Car buildTrackReadySportsCar(CarBuilder builder, String brand, String model) {
        return builder.reset()
                .setBrand(brand)
                .setModel(model)
                .setEngine("V8 Naturally Aspirated", TRACK_HORSEPOWER)
                .setTransmission("Manual")
                .setColor("Matte Black")
                .addSportPackage()
                .build();
    }

    public Car buildFamilySuv(CarBuilder builder, String brand, String model) {
        return builder.reset()
                .setBrand(brand)
                .setModel(model)
                .setEngine("Inline-4 Hybrid", FAMILY_SUV_HORSEPOWER)
                .setTransmission("Automatic")
                .setColor("White")
                .addGps()
                .addSunroof()
                .build();
    }

    public Car buildOffRoadSuv(CarBuilder builder, String brand, String model) {
        return builder.reset()
                .setBrand(brand)
                .setModel(model)
                .setEngine("V6 Diesel", OFF_ROAD_SUV_HORSEPOWER)
                .setTransmission("Automatic")
                .setColor("Khaki Green")
                .addOffRoadPackage()
                .build();
    }
}

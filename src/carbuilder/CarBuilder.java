package carbuilder;
public interface CarBuilder {

    CarBuilder setBrand(String brand);

    CarBuilder setModel(String model);

    CarBuilder setEngine(String engineType, int horsepower);

    CarBuilder setTransmission(String transmission);

    CarBuilder setSeats(int seats);

    CarBuilder setDoors(int doors);

    CarBuilder setColor(String color);

    CarBuilder addGps();

    CarBuilder addSunroof();

    CarBuilder addAllWheelDrive();

    CarBuilder addSportPackage();

    CarBuilder addOffRoadPackage();

    Car build();

    CarBuilder reset();

    String getBrand();

    String getModel();

    String getEngineType();

    int getHorsepower();

    String getTransmission();

    int getSeats();

    int getDoors();

    String getColor();

    boolean hasGps();

    boolean hasSunroof();

    boolean hasAllWheelDrive();

    boolean hasSportPackage();

    boolean hasOffRoadPackage();
}

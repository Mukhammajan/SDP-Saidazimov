package carbuilder;
public final class Car {

    private final String brand;
    private final String model;
    private final String engineType;
    private final int horsepower;
    private final String transmission;
    private final int seats;
    private final int doors;
    private final String color;
    private final boolean hasGps;
    private final boolean hasSunroof;
    private final boolean hasAllWheelDrive;
    private final boolean hasSportPackage;
    private final boolean hasOffRoadPackage;

    Car(CarBuilder builder) {
        this.brand = builder.getBrand();
        this.model = builder.getModel();
        this.engineType = builder.getEngineType();
        this.horsepower = builder.getHorsepower();
        this.transmission = builder.getTransmission();
        this.seats = builder.getSeats();
        this.doors = builder.getDoors();
        this.color = builder.getColor();
        this.hasGps = builder.hasGps();
        this.hasSunroof = builder.hasSunroof();
        this.hasAllWheelDrive = builder.hasAllWheelDrive();
        this.hasSportPackage = builder.hasSportPackage();
        this.hasOffRoadPackage = builder.hasOffRoadPackage();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        StringBuilder summary = new StringBuilder();
        summary.append(brand).append(' ').append(model).append(" [")
                .append(engineType).append(", ").append(horsepower).append(" hp, ")
                .append(transmission).append(", ").append(doors).append("-door, ")
                .append(seats).append("-seat, ").append(color);

        if (hasGps) {
            summary.append(", GPS");
        }
        if (hasSunroof) {
            summary.append(", Sunroof");
        }
        if (hasAllWheelDrive) {
            summary.append(", AWD");
        }
        if (hasSportPackage) {
            summary.append(", Sport Package");
        }
        if (hasOffRoadPackage) {
            summary.append(", Off-Road Package");
        }
        summary.append(']');
        return summary.toString();
    }
}

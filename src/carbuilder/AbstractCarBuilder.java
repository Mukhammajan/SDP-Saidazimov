package carbuilder;
abstract class AbstractCarBuilder implements CarBuilder {
    private String brand = "";
    private String model = "";
    private String engineType = "";
    private int horsepower;
    private String transmission = "";
    private int seats;
    private int doors;
    private String color = "";
    private boolean gps;
    private boolean sunroof;
    private boolean allWheelDrive;
    private boolean sportPackage;
    private boolean offRoadPackage;
    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engineType, int horsepower) {
        this.engineType = engineType;
        this.horsepower = horsepower;
        return this;
    }

    @Override
    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder addGps() {
        this.gps = true;
        return this;
    }

    @Override
    public CarBuilder addSunroof() {
        this.sunroof = true;
        return this;
    }

    @Override
    public CarBuilder addAllWheelDrive() {
        this.allWheelDrive = true;
        return this;
    }

    @Override
    public CarBuilder addSportPackage() {
        this.sportPackage = true;
        return this;
    }

    @Override
    public CarBuilder addOffRoadPackage() {
        this.offRoadPackage = true;
        return this;
    }

    @Override
    public CarBuilder reset() {
        brand = "";
        model = "";
        engineType = "";
        horsepower = 0;
        transmission = "";
        seats = 0;
        doors = 0;
        color = "";
        gps = false;
        sunroof = false;
        allWheelDrive = false;
        sportPackage = false;
        offRoadPackage = false;
        return this;
    }

    protected void requireField(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalStateException(fieldName + " must be set before build().");
        }
    }

    protected void setAllWheelDriveDefault(boolean enabled) {
        this.allWheelDrive = enabled;
    }

    protected void setSeatsDefault(int seats) {
        this.seats = seats;
    }

    protected void setDoorsDefault(int doors) {
        this.doors = doors;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }
    @Override
    public int getHorsepower() {
        return horsepower;
    }
    @Override
    public String getTransmission() {
        return transmission;
    }

    @Override
    public int getSeats() {
        return seats;
    }

    @Override
    public int getDoors() {
        return doors;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean hasGps() {
        return gps;
    }

    @Override
    public boolean hasSunroof() {
        return sunroof;
    }

    @Override
    public boolean hasAllWheelDrive() {
        return allWheelDrive;
    }

    @Override
    public boolean hasSportPackage() {
        return sportPackage;
    }

    @Override
    public boolean hasOffRoadPackage() {
        return offRoadPackage;
    }
}

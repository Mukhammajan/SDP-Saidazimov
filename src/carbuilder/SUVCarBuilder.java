package carbuilder;
public class SUVCarBuilder extends AbstractCarBuilder {

    private static final int DEFAULT_SEATS = 5;
    private static final int DEFAULT_DOORS = 4;

    public SUVCarBuilder() {
        applySuvDefaults();
    }

    @Override
    public CarBuilder reset() {
        super.reset();
        applySuvDefaults();
        return this;
    }

    private void applySuvDefaults() {
        setSeatsDefault(DEFAULT_SEATS);
        setDoorsDefault(DEFAULT_DOORS);
        setAllWheelDriveDefault(true);
    }

    @Override
    public CarBuilder addSportPackage() {
        throw new UnsupportedOperationException(
                "Sport package is not offered on the SUV line.");
    }

    @Override
    public Car build() {
        requireField(getBrand(), "brand");
        requireField(getModel(), "model");
        requireField(getEngineType(), "engine type");
        return new Car(this);
    }
}

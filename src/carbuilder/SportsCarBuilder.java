package carbuilder;
public class SportsCarBuilder extends AbstractCarBuilder {

    private static final int DEFAULT_SEATS = 2;
    private static final int DEFAULT_DOORS = 2;
    private static final int MINIMUM_SPORTS_HORSEPOWER = 250;

    public SportsCarBuilder() {
        applySportsDefaults();
    }

    @Override
    public CarBuilder reset() {
        super.reset();
        applySportsDefaults();
        return this;
    }

    private void applySportsDefaults() {
        setSeatsDefault(DEFAULT_SEATS);
        setDoorsDefault(DEFAULT_DOORS);
    }

    @Override
    public CarBuilder addOffRoadPackage() {
        throw new UnsupportedOperationException(
                "Off-road package is not offered on the sports car line.");
    }

    @Override
    public Car build() {
        requireField(getBrand(), "brand");
        requireField(getModel(), "model");
        requireField(getEngineType(), "engine type");

        if (getHorsepower() < MINIMUM_SPORTS_HORSEPOWER) {
            throw new IllegalStateException(
                    "Sports car requires at least " + MINIMUM_SPORTS_HORSEPOWER + " hp.");
        }
        return new Car(this);
    }
}

package Transport;

import java.util.Objects;

import static Transport.ValidateUtils.*;

public abstract class Driver {

    private final String name;
    private final Boolean driverLicense;
    private final Integer experience;

    public Driver(String name, Boolean driverLicense, Integer experience) {
        this.name = validateDefault(name);
        this.driverLicense = validateBoolean(driverLicense);
        this.experience = validateNumber(experience);
    }
    // region getters

    public String getName() {
        return name;
    }

    public Boolean getDriverLicense() {
        return driverLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    //endregion

    abstract String start();

    abstract String stop();

    abstract String refuel();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(name, driver.name) && Objects.equals(driverLicense, driver.driverLicense) && Objects.equals(experience, driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, experience);
    }
}

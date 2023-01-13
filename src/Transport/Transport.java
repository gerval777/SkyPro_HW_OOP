package Transport;

import java.util.Objects;

import static Transport.ValidateUtils.validateDefault;
import static Transport.ValidateUtils.validateNumber;

public abstract class Transport {
    private String brand;
    private String type;
    private String color;
    private int secondsOfPitstop;
    private int secondsOfLapTime;
    private int maxSpeed;

    public Transport(String brand, String type, String color) {
        setBrand(brand);
        setType(type);
        setColor(color);
    }

    public Transport(String brand, String type, String color, int secondsOfPitstop, int secondsOfLapTime, int maxSpeed) {
        setBrand(brand);
        setType(type);
        setColor(color);
        setSecondsOfPitstop(secondsOfPitstop);
        setSecondsOfLapTime(secondsOfLapTime);
        setMaxSpeed(maxSpeed);
    }

    // region getters&setters
    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = validateDefault(brand);
    }

    public final String getType() {
        return type;
    }

    public final void setType(String type) {
        this.type = validateDefault(type);
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = validateDefault(color);
    }

    public final int getSecondsOfPitstop() {
        return secondsOfPitstop;
    }

    public final void setSecondsOfPitstop(int secondsOfPitstop) {
        this.secondsOfPitstop = validateNumber(secondsOfPitstop);
    }

    public final int getSecondsOfLapTime() {
        return secondsOfLapTime;
    }

    public final void setSecondsOfLapTime(int secondsOfLapTime) {
        this.secondsOfLapTime = validateNumber(secondsOfLapTime);
    }

    public final int getMaxSpeed() {
        return maxSpeed;
    }

    public final void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = validateNumber(maxSpeed);
    }
    //endregion


    public final String addingToString() {
        String s;
        if (getMaxSpeed() > 0 || getSecondsOfPitstop() > 0 || getSecondsOfLapTime() > 0) {
            s = "; Лучшее время на пит стоп: " + getSecondsOfPitstop() + " сек.; Лучший круг: " + getSecondsOfLapTime() +
                    " сек.; Максимальная скорость: " + getMaxSpeed() + " сек.";
        } else {
            return ".";
        }
        return s;
    }

    abstract void startToMove();

    abstract void finish();

    @Override
    public String toString() {
        return "Участник гонок: " + getType() + ", Марка: " + getBrand() + ", Цвет: " + getColor() + addingToString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return secondsOfPitstop == transport.secondsOfPitstop && secondsOfLapTime == transport.secondsOfLapTime &&
                maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals
                (type, transport.type) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, type, color, secondsOfPitstop, secondsOfLapTime, maxSpeed);
    }
}

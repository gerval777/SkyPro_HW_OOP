package Transport;

public class DriverB <T extends Car > extends Driver {

    public DriverB(String name, Boolean driverLicense, Integer experience) {
        super(name, driverLicense, experience);
    }

    @Override
    String start() {
        return "Автомобиль начинает движение";
    }

    @Override
    String stop() {
        return "Автомобиль останавливается";
    }

    @Override
    String refuel() {
        return "Автомобиль заправляется бензином";
    }

    public String getCarMessage(T car) {
        return "Водитель "+ getName()+ " управляет автомобилем " + car.getBrand() +" " + car.getType() +
                " и будет участвовать в заезде";
    }

}

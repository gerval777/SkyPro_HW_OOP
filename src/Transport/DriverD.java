package Transport;

public class DriverD <T extends Bus > extends Driver {

    public DriverD(String name, Boolean driverLicense, Integer experience) {
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

    public String getCarMessage(T bus) {
        return "Водитель "+ getName()+ " управляет автомобилем " + bus.getBrand() +" " + bus.getType() +
                " и будет участвовать в заезде";
    }
}

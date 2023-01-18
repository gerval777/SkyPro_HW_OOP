package Transport;

public class DriverC <T extends Truck > extends Driver {

    public DriverC(String name, Boolean driverLicense, Integer experience) {
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


    public String getCarMessage(T truck) {
        return "Водитель "+ getName()+ " управляет автомобилем " + truck.getBrand() +" " + truck.getType() +
                " и будет участвовать в заезде";
    }
}

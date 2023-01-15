package Transport;

public final class Truck extends Transport implements Competing {

    public Truck(String brand, String type, String color) {
        super(brand, type, color);
    }
    public Truck(String brand, String type, String color,int secondsOfPitstop, int secondsOfLapTime, int maxSpeed) {
        super(brand, type, color,secondsOfPitstop,secondsOfLapTime,maxSpeed);
    }
    @Override
    void startToMove() {
        System.out.println("Грузовой автомобиль начинает движение");
    }

    @Override
    void finish() {
        System.out.println("Грузовой автомобиль заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Лучшее время на пит стоп: " +getSecondsOfPitstop()+ " сек.");
    }

    @Override
    public void bestLaptime() {
        System.out.println("Лучший круг: " +getSecondsOfLapTime()+ " сек.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: " +getMaxSpeed()+ " сек.");
    }
}

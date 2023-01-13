package Transport;

public final class Bus extends Transport implements Competing {

    public Bus(String brand, String type, String color) {
        super(brand, type, color);
    }
    @Override
    void startToMove() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    void finish() {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Лучшее время на пит стоп: " + getSecondsOfPitstop() + " сек.");
    }

    @Override
    public void bestLaptime() {
        System.out.println("Лучший круг: " + getSecondsOfLapTime() + " сек.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: " + getMaxSpeed() + " сек.");
    }
}
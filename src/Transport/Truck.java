package Transport;

public final class Truck extends Transport implements Competing {
    public enum LoadCapacity {
        N1(0, 3.5),
        N2(3.5, 12),
        N3(12, 99);

        private double min;
        private double max;

        LoadCapacity(double min, double max) {
            this.min = min;
            this.max = max;
        }

        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }

        public static LoadCapacity getValue(double value) {
            for (LoadCapacity i : LoadCapacity.values()) {
                if (value >= i.getMin() && value <= i.getMax()) {
                    return i;
                }
                if (value <= i.getMin() && value <= i.getMax()) {
                    return N1;
                }
            }
            return N3;
        }

        @Override
        public String toString() {
                if (N1 == this) {
                    return "Грузоподъемность: до " + getMax() + " тонн.";
                } else if (N2 == this) {
                    return "Грузоподъемность: от " + getMin() + " тонн до " + getMax() + " тонн.";
                }else if (N3 == this) {
                    return "N3 Грузоподъемность: от " + getMin() + " тонн.";
                }
                return "Ваш номер в очереди к психиатру 2. Перед Вами разработчик этого кода";
            }
    }

    private LoadCapacity loadCapacity;

    public Truck(String brand, String type, String color) {
        super(brand, type, color);
        printType();
    }

    public Truck(String brand, String type, String color, LoadCapacity loadCapacity) {
        super(brand, type, color);
        setLoadCapacity(loadCapacity);
    }

    public Truck(String brand, String type, String color, int secondsOfPitstop, int secondsOfLapTime, int maxSpeed) {
        super(brand, type, color, secondsOfPitstop, secondsOfLapTime, maxSpeed);
        printType();
    }

    public Truck(String brand, String type, String color, int secondsOfPitstop, int secondsOfLapTime, int maxSpeed, LoadCapacity loadCapacity) {
        super(brand, type, color, secondsOfPitstop, secondsOfLapTime, maxSpeed);
        setLoadCapacity(loadCapacity);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        if (loadCapacity == null) {
            System.out.println("Некорректные данные");
            return;
        }
        this.loadCapacity = loadCapacity;
    }
    @Override
    void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
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

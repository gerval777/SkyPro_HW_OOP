package Transport;

public final class Bus extends Transport implements Competing {
    public enum Size {
        MISTAKE(Integer.MIN_VALUE, 9),
        XS(10, 25),
        S(26, 50),
        M(51, 80),
        L(81, 120),
        XL(121, 150),
        XXL(150, Integer.MAX_VALUE);

        private int min;
        private int max;

        Size(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        public static Size getValue(int value) {
            for (Size i : Size.values()) {
                if (value >= i.getMin() && value <= i.getMax()) {
                    return i;
                }
                if (value <= i.getMin() && value <= i.getMax()) {
                    return MISTAKE;
                }
            }
            return XXL;
        }

        @Override
        public final String toString() {
            if (min < 10) {
                return "Может стоит задуматься о микроавтобусе?";
            } else if (max < 150) {
                return "Вместимость: " + getMin() + " - " + getMax() + " мест";
            } else if (max > 150) {
                return "Понадобится несколько автобусов для такого количества людей";
            }
            return null;
        }
    }

    private Size size;

    public Bus(String brand, String type, String color) {
        super(brand, type, color);
    }

    public Bus(String brand, String type, String color, Size size) {
        super(brand, type, color);
        setSize(size);
    }

    public Bus(String brand, String type, String color, int secondsOfPitstop, int secondsOfLapTime, int maxSpeed) {
        super(brand, type, color, secondsOfPitstop, secondsOfLapTime, maxSpeed);
    }

    public Bus(String brand, String type, String color, int secondsOfPitstop, int secondsOfLapTime, int maxSpeed, Size size) {
        super(brand, type, color, secondsOfPitstop, secondsOfLapTime, maxSpeed);
        setSize(size);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        if (size == null) {
            System.out.println("Некорректные данные");
            return;
        }
        this.size = size;
    }

    @Override
    void printType() {
        if (getType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(getType());
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
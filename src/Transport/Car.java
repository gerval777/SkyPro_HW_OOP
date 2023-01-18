package Transport;

public final class Car extends Transport implements Competing{

    public enum BodyType {

        BT_SEDAN ("Седан"),
        BT_HATCHBACK ("Хетчбек"),
        BT_COUPE ("Купе"),
        BT_STATION_WAGON ("Универсал"),
        BT_SUV ("Внедорожник"),
        BT_CROSSOVER ("Кроссовер"),
        BT_PICKUP_TRUCK ("Пикап"),
        BT_VAN ("Фургон"),
        BT_MINIVAN ("Минивэн");

        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + getBodyType();
        }
    }

    BodyType bodyType;

    public Car(String brand, String type, String color) {
        super(brand, type, color);
    }
    public Car(String brand, String type, String color, BodyType bodyType) {
        super(brand, type, color);
        setBodyType(bodyType);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            System.out.println("Некорректные данные");
            return;
        }
        this.bodyType = bodyType;
    }

    @Override
    void startToMove() {
        System.out.println("Легковой автомобиль начинает движение");
    }

    @Override
    void finish() {
        System.out.println("Легковой автомобиль заканчивает движение");
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


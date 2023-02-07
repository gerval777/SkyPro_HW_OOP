package Transport;

public class TestRaces {
    public static void main(String[] args) {

        Truck truck1 = new Truck("Fura", "Самосвал", "Зеленая", 0, 500, 250);
        Truck truck2 = new Truck("Fura", "Погрузчик", "Желтый");
        Truck truck3 = new Truck("Fura", "Бетономешалка", "Красный");
        Truck truck4 = new Truck("Fura", "Грузовой", "Черный");

        Car car1 = new Car("Mazda", "Купэ", "Синий");
        Car car2 = new Car("Honda", "Седан", "Ораньжевый");
        Car car3 = new Car("Opel", "Пикап", "Белый");
        Car car4 = new Car("Ford", "Хэтчбэк", "Серый");

        Bus bus1 = new Bus("Busi", "Пазик", "Голубой");
        Bus bus2 = new Bus("Busi", "Колокольчик", "Фиолетовый");
        Bus bus3 = new Bus("Busi", "Двухярка", "Ржавый");
        Bus bus4 = new Bus("Busi", "Моссон", "Сиреневый");


        DriverB driverB = new DriverB<Car>("Олег", true, 10);
        System.out.println(driverB.getCarMessage(car1));
        System.out.println(Car.BodyType.BT_HATCHBACK + "\n");

        DriverC driverC = new DriverC<Truck>("Дмитрий", true, 11);
        System.out.println(driverC.getCarMessage(truck1));
        System.out.println(Truck.LoadCapacity.getValue(3) + "\n");

        DriverD driverD = new DriverD<Bus>("Максим", true, 12);
        System.out.println(driverD.getCarMessage(bus1));
        System.out.println(Bus.Size.getValue(160) + "\n");

    }
}

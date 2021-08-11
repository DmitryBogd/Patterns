import Factory.*;

public class Patterns {
    public static void main(String[] args) {
        //Singleton
        TestSingleton.getInsance().print();

        //Factory

        Car car = GetCar.getCar().selectCar(RoadType.GASON);
        car.drive();
        car.stop();

        Car car1 = GetCar.getCar().selectCar(RoadType.OFF_ROAD);
        car1.drive();
        car1.stop();

        car = GetCar.getCar().selectCar(RoadType.CITY);
        car.drive();
    }
}

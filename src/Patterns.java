import Factory.*;

public class Patterns {
    public static void main(String[] args) {
        //Singleton
        TestSingleton.getInsance().print();

        //Factory
        GetCar getCar = new GetCar();

        Car car = getCar.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        Car car1 = getCar.getCar(RoadType.CITY);
        car1.drive();
        car1.stop();

        car = getCar.getCar(RoadType.GASON);
        car.drive();
    }
}

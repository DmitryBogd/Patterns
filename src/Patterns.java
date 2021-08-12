import AbstractFactory.factories.FirstFactory;
import AbstractFactory.interfaces.TransportFactory;
import AbstractFactory.transport.interfaces.Aircraft;
import Decorator.decorators.BorderDecorator;
import Decorator.decorators.ColorDecorator;
import Decorator.decorators.Decorator;
import Decorator.objects.Component;
import Decorator.objects.Window;
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

        //Abstract Factory

        TransportFactory firstFactory = new FirstFactory();

        Aircraft aircraft = firstFactory.createAircraft();
        aircraft.flight();

        //Decorator

        Component windowWithBorder = new BorderDecorator(new ColorDecorator(new Window()));
        windowWithBorder.draw();

        //Adapter
    }
}

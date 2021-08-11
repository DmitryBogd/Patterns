package AbstractFactory.factories;

import AbstractFactory.impl.aircraft.Boeing;
import AbstractFactory.impl.car.Geep;
import AbstractFactory.interfaces.TransportFactory;
import AbstractFactory.transport.interfaces.Aircraft;
import AbstractFactory.transport.interfaces.Car;

public class SecondFactory implements TransportFactory {


    @Override
    public Car createCar() {
        return new Geep();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing();
    }
}

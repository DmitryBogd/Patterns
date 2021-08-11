package AbstractFactory.factories;

import AbstractFactory.impl.aircraft.Airbus;
import AbstractFactory.impl.car.Porshe;
import AbstractFactory.interfaces.TransportFactory;
import AbstractFactory.transport.interfaces.Aircraft;
import AbstractFactory.transport.interfaces.Car;

public class FirstFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porshe();
    }

    @Override
    public Aircraft createAircraft() {
        return new Airbus();
    }
}

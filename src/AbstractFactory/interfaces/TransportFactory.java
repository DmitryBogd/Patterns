package AbstractFactory.interfaces;


import AbstractFactory.transport.interfaces.Aircraft;
import AbstractFactory.transport.interfaces.Car;


public interface TransportFactory {

    Car createCar();

    Aircraft createAircraft();
}

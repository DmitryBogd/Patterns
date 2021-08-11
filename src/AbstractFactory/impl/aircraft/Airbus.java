package AbstractFactory.impl.aircraft;

import AbstractFactory.transport.interfaces.Aircraft;

public class Airbus implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Airbus");
    }
}

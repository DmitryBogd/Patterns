package AbstractFactory.impl.aircraft;

import AbstractFactory.transport.interfaces.Aircraft;

public class Boeing implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Boeing");
    }
}

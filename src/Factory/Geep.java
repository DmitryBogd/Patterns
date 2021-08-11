package Factory;

public class Geep implements Car {

    @Override
    public void drive() {
        System.out.println("Drive 120km Geep");
    }

    @Override
    public void stop() {
        System.out.println("Stop 2 sec Geep");
    }
}
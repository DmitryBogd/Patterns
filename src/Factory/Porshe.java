package Factory;

public class Porshe implements Car {

    @Override
    public void drive() {
        System.out.println("Drive 150 km Porshe");
    }

    @Override
    public void stop() {
        System.out.println("Stop 1 sec Porshe");
    }
}

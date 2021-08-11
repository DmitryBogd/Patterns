package Factory;

public class GetCar {
    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
            case CITY:
                car = new Porshe();
                break;
            case OFF_ROAD:
                car = new NewGeep();
                break;
            case GASON:
                car = new Geep();
                break;
        }
        return car;
    }
}

package Factory;

public class GetCar {
    private static GetCar instance;

    public static GetCar getCar() {
        if (instance == null)
            instance = new GetCar();

        return instance;
    }

    private GetCar(){

    }

    public Car selectCar(RoadType roadType){
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

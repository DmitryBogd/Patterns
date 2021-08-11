public class TestSingleton {

    public static TestSingleton instance;

    public static TestSingleton getInsance(){
        if(instance==null)
            instance = new TestSingleton();

        return instance;
    }

    private TestSingleton(){
    }

    public void print(){
        System.out.println(this);
    }
}

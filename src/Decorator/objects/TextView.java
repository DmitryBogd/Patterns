package Decorator.objects;

public class TextView implements Component {
    @Override
    public void draw() {
        System.out.println("draw textView");
    }
}

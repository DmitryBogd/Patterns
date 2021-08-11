package Decorator.decorators;

import Decorator.objects.Component;

public class BorderDecorator extends Decorator{
    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...added border");
    }
}

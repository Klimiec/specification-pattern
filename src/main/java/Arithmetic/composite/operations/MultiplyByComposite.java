package Arithmetic.composite.operations;

import Arithmetic.component.Component;
import Arithmetic.composite.Composite;


public class MultiplyByComposite extends Composite {

    private final Component a;
    private final Component b;

    public MultiplyByComposite(Component a, Component b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int value() {
        return a.value() * b.value();
    }
}

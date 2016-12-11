package Arithmetic.composite;


import Arithmetic.component.Component;
import Arithmetic.composite.operations.AddComposite;
import Arithmetic.composite.operations.MinusComposite;
import Arithmetic.composite.operations.MultiplyByComposite;

public abstract class Composite implements Component {

    public Component add(Component otherPoint) {
        return new AddComposite(this, otherPoint);
    }

    public Component minus(Component otherPoint) {
        return new MinusComposite(this, otherPoint);
    }

    public Component multiplyBy(Component otherPoint) {
        return new MultiplyByComposite(this, otherPoint);
    }
}

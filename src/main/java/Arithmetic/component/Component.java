package Arithmetic.component;


public interface Component {

    public int value();

    /* Fluent interface */
    public Component add(Component otherPoint);

    public Component minus(Component otherPoint);

    public Component multiplyBy(Component otherPoint);

}

package Specification.sharedkernel.specification;



import java.util.Arrays;
import java.util.List;

public abstract class CompositeSpecification<T> implements Specification<T> {

    public Specification<T> conjunction(Specification<T>... conditions) {
        List<Specification<T>> specifications = Arrays.asList(conditions);
        return new ConjunctionSpecification(conditions);
    }

    /*fluent interface*/
    public Specification<T> and(Specification<T> condition) {
        return new AndSpecification<T>(this, condition);
    }

    public Specification<T> or(Specification<T> condition) {
        return new OrSpecification(this, condition);
    }

    public Specification<T> not() {
        return new NotSpecification(this);
    }
}

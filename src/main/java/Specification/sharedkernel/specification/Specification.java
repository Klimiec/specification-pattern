package Specification.sharedkernel.specification;

public interface Specification<T> {

    boolean isSatisfiedBy(T candidate);

    Specification<T> conjunction(Specification<T>... conditions);

    /*fluent interface*/
    Specification<T> and(Specification<T> condition);

    Specification<T> or(Specification<T> condition);

    Specification<T> not();
}

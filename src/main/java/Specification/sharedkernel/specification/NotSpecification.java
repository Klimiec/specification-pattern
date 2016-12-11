package Specification.sharedkernel.specification;

public class NotSpecification<T> extends CompositeSpecification<T>{


    private Specification<T> condition;

    public NotSpecification(Specification<T> condition) {
        this.condition = condition;
    }

    public boolean isSatisfiedBy(T candidate) {
        return !condition.isSatisfiedBy(candidate);
    }
}

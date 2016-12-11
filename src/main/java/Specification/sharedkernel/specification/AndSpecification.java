package Specification.sharedkernel.specification;


public class AndSpecification<T> extends CompositeSpecification<T> {

    private Specification<T> left;
    private Specification<T> right;

    public AndSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    public boolean isSatisfiedBy(T candidate) {
        return left.isSatisfiedBy(candidate) && right.isSatisfiedBy(candidate);
    }
}

package Specification.sharedkernel.specification;


public class ConjunctionSpecification<T> extends CompositeSpecification<T> {


    private  Specification<T>[] specifications;

    public ConjunctionSpecification(Specification<T>... specifications) {
        this.specifications = specifications;
    }

    public boolean isSatisfiedBy(T candidate) {
        for (Specification<T> specification :specifications) {
            if (!specification.isSatisfiedBy(candidate)) {
                return false;
            }
        }
        return true;
    }
}

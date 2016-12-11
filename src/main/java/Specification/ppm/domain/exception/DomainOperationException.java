package Specification.ppm.domain.exception;

public class DomainOperationException extends RuntimeException{

    public DomainOperationException(String mesage) {
        super(mesage);
    }
}

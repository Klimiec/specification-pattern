package Specification.ppm.domain.exception;


public class TimeSheetOperationException extends RuntimeException {

    public TimeSheetOperationException(String mesage, Integer timeSheetId) {
        super(mesage);
    }

}

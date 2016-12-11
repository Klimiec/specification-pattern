package Specification.ppm.domain.timesheet;


public class User {

    private Country country;

    public enum Country {
        PL, CHE, IT
    }

    public Country getCountry() {
        return country;
    }
}

package Specification.ppm.domain.timesheet;


public class WorkDay {

    private int hours;

    public boolean isWeekend() {
        return false;
    }

    public int getHours() {
        return hours;
    }
}

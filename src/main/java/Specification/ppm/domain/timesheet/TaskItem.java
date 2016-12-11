package Specification.ppm.domain.timesheet;


import java.util.List;

public class TaskItem {

    private List<WorkDay> workDays;
    private int expectedHours;

    public List<WorkDay> getWorkDays() {
        return workDays;
    }

    public int getExpectedHours() {
        return expectedHours;
    }

    public int getWorkedHours() {
        //TODO: calculate actual amount
        return 10;
    }

}

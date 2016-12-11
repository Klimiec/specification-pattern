package Specification.ppm.domain.timesheet;


import java.util.List;

//@Entity
//@Table(name="TimeSheets")
public class TimeSheet {


    public enum TimeSheetStatus {
        NEW, AWAITING, APPROVED
    }

    //@Enumerated(EnumType.STRING)
    private TimeSheetStatus status;

    private User user;

    private int totalHoursWorks;



    public void approve() {

        status = TimeSheetStatus.APPROVED;
    }


    public List<TaskItem> getTaskItems() {

        return null;
    }

    public TimeSheetStatus getStatus() {
        return status;
    }

    public int getTotalHoursWorks() {
        return totalHoursWorks;
    }

    public User getUser() {
        return user;
    }
}

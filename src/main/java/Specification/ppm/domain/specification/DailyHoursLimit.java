package Specification.ppm.domain.specification;

import Specification.sharedkernel.specification.CompositeSpecification;
import Specification.ppm.domain.timesheet.TaskItem;
import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.timesheet.WorkDay;


public class DailyHoursLimit extends CompositeSpecification<TimeSheet> {

    private int dailyHoursLimit;

    public DailyHoursLimit(int dailyHoursLimit) {
        this.dailyHoursLimit = dailyHoursLimit;
    }

    public boolean isSatisfiedBy(TimeSheet candidate) {

        for (TaskItem task :candidate.getTaskItems()) {
            for(WorkDay workDay :task.getWorkDays()) {
                if (dailyHoursLimitExceeded(workDay)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dailyHoursLimitExceeded(WorkDay workDay) {
        return workDay.getHours() > dailyHoursLimit;
    }
}

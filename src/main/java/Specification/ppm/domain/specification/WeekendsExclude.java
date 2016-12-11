package Specification.ppm.domain.specification;


import Specification.sharedkernel.specification.CompositeSpecification;
import Specification.ppm.domain.timesheet.TaskItem;
import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.timesheet.WorkDay;

public class WeekendsExclude extends CompositeSpecification<TimeSheet> {


    public boolean isSatisfiedBy(TimeSheet candidate) {

        for (TaskItem task :candidate.getTaskItems()) {
            for(WorkDay workDay :task.getWorkDays()) {
                if(workInWeekend(workDay)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean workInWeekend(WorkDay workDay) {
        return workDay.isWeekend() && workDay.getHours() > 0;
    }
}

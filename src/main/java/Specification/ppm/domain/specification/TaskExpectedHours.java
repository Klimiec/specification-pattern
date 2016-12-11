package Specification.ppm.domain.specification;


import Specification.sharedkernel.specification.CompositeSpecification;
import Specification.ppm.domain.timesheet.TaskItem;
import Specification.ppm.domain.timesheet.TimeSheet;

public class TaskExpectedHours extends CompositeSpecification<TimeSheet> {

    public boolean isSatisfiedBy(TimeSheet candidate) {

        for (TaskItem task :candidate.getTaskItems()) {
            if(workHoursExceeded(task)) {
                return false;
            }
        }
        return true;
    }

    private boolean workHoursExceeded(TaskItem task) {

        if(expectedHoursNotDefined(task)) {
            return false;
        }
        return task.getWorkedHours() > task.getExpectedHours();
    }

    private boolean expectedHoursNotDefined(TaskItem task) {
        return task.getExpectedHours() == 0;
    }
}

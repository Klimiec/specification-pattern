package Specification.ppm.domain.specification;

import Specification.sharedkernel.specification.CompositeSpecification;
import Specification.ppm.domain.timesheet.TimeSheet;


public class TaskItemsCount  extends CompositeSpecification<TimeSheet> {

    private int min;

    private int max;

    public TaskItemsCount(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean isSatisfiedBy(TimeSheet candidate) {
        if(candidate.getTaskItems().size() < min) {
            return false;
        }

        if (candidate.getTaskItems().size() > max) {
            return false;
        }

        return true;
    }
}

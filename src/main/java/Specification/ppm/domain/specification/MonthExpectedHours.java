package Specification.ppm.domain.specification;


import Specification.sharedkernel.specification.CompositeSpecification;
import Specification.ppm.domain.timesheet.TimeSheet;

public class MonthExpectedHours extends CompositeSpecification<TimeSheet> {

    private int monthExpectedHours;

    public MonthExpectedHours() {
        //TODO: calculate hours for current month
        this.monthExpectedHours = 160;
    }

    public boolean isSatisfiedBy(TimeSheet candidate) {
        return candidate.getTotalHoursWorks() == monthExpectedHours;
    }
}

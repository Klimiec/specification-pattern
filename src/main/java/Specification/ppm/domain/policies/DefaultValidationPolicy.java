package Specification.ppm.domain.policies;

import Specification.ppm.domain.timesheet.TimeSheet;


public class DefaultValidationPolicy implements TimeSheetValidationPolicy {

    public boolean isSatisfiedBy(TimeSheet timeSheet) {
        return false;
    }
}

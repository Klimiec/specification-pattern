package Specification.ppm.domain.policies;

import Specification.ppm.domain.timesheet.TimeSheet;

public interface TimeSheetValidationPolicy {

    boolean isSatisfiedBy(TimeSheet timeSheet);
}

package Specification.ppm.domain.specification.factory;

import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.timesheet.User;
import Specification.ppm.domain.timesheet.User.Country;
import Specification.sharedkernel.specification.Specification;


public abstract class TimeSheetCountrySpecificationFactory {

    public abstract Specification<TimeSheet> create(User user);

    public abstract Country country();

    public boolean match(User user) {
        return true;
    }
}

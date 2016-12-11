package Specification.ppm.domain.specification.factory.country;


import Specification.ppm.domain.specification.*;
import Specification.ppm.domain.specification.factory.TimeSheetCountrySpecificationFactory;
import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.timesheet.User.Country;
import Specification.ppm.domain.timesheet.User;
import Specification.sharedkernel.specification.ConjunctionSpecification;
import Specification.sharedkernel.specification.Specification;

public class PolishTimeSheetCountrySpecification extends TimeSheetCountrySpecificationFactory {

    public Specification<TimeSheet> create(User user) {

        Specification<TimeSheet> specification =  new ConjunctionSpecification<TimeSheet>(
                new TaskExpectedHours(),
                new TaskItemsCount(1,10),
                new WeekendsExclude(),
                new MonthExpectedHours()
        );

        if (isManager(user)) {
            specification = specification.and(new DailyHoursLimit(10));
        } else {
            specification = specification.and(new DailyHoursLimit(8));
        }

        return specification;
    }

    public Country country() {
        return Country.PL;
    }

    private boolean isManager(User user) {
        //TODO: determine if user is a manager
        return false;
    }

}

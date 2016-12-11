package Specification.ppm.domain.specification.factory.country;

import Specification.ppm.domain.specification.MonthExpectedHours;
import Specification.ppm.domain.specification.TaskItemsCount;
import Specification.ppm.domain.specification.WeekendsExclude;
import Specification.ppm.domain.specification.factory.TimeSheetCountrySpecificationFactory;
import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.timesheet.User;
import Specification.ppm.domain.timesheet.User.Country;
import Specification.sharedkernel.specification.Specification;


public class ItalianTimeSheetCountrySpecification extends TimeSheetCountrySpecificationFactory {

    public Specification<TimeSheet> create(User user) {

        Specification<TimeSheet> specification =   new MonthExpectedHours()
                                                       .and(new WeekendsExclude())
                                                       .and(new TaskItemsCount(1,10));

        return specification;
    }

    public Country country() {
        return Country.IT;
    }
}

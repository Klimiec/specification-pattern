package Specification.ppm.domain.specification.factory.country;

import Specification.ppm.domain.specification.TaskExpectedHours;
import Specification.ppm.domain.specification.TaskItemsCount;
import Specification.ppm.domain.specification.factory.TimeSheetCountrySpecificationFactory;
import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.timesheet.User;
import Specification.ppm.domain.timesheet.User.Country;
import Specification.sharedkernel.specification.ConjunctionSpecification;
import Specification.sharedkernel.specification.Specification;

public class SwissTimeSheetCountrySpecification extends TimeSheetCountrySpecificationFactory {

    public Specification<TimeSheet> create(User user) {

        Specification<TimeSheet> specification =  new ConjunctionSpecification<TimeSheet>(
                new TaskExpectedHours(),
                new TaskItemsCount(1,5)
        );

        return specification;
    }

    public Country country() {
        return Country.CHE;
    }
}

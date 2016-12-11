package Specification.ppm.domain.specification.factory;


import Specification.ppm.domain.exception.DomainOperationException;
import Specification.ppm.domain.specification.factory.country.ItalianTimeSheetCountrySpecification;
import Specification.ppm.domain.specification.factory.country.PolishTimeSheetCountrySpecification;
import Specification.ppm.domain.specification.factory.country.SwissTimeSheetCountrySpecification;
import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.timesheet.User;
import Specification.sharedkernel.specification.Specification;

import java.util.ArrayList;
import java.util.List;

public class TimeSheetAggregateSpecificationFactory {

    List<TimeSheetCountrySpecificationFactory> countriesSpecificationFactory;

    public TimeSheetAggregateSpecificationFactory() {
        this.countriesSpecificationFactory = new ArrayList<TimeSheetCountrySpecificationFactory>();
        countriesSpecificationFactory.add(new PolishTimeSheetCountrySpecification());
        countriesSpecificationFactory.add(new ItalianTimeSheetCountrySpecification());
        countriesSpecificationFactory.add(new SwissTimeSheetCountrySpecification());
    }

    public void addNewCountrySpecyfication(TimeSheetCountrySpecificationFactory country) {
        this.countriesSpecificationFactory.add(country);
    }

    public Specification<TimeSheet> create(User user) {
        for (TimeSheetCountrySpecificationFactory countrySpecificationFactory : countriesSpecificationFactory) {
            if (countrySpecificationFactory.match(user)) {
                return countrySpecificationFactory.create(user);
            }
        }
        throw new DomainOperationException("Specification for a country not found: " + user.getCountry());
    }

    //...

}

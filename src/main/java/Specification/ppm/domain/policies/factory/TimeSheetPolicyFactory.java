package Specification.ppm.domain.policies.factory;

import Specification.ppm.domain.policies.*;
import Specification.ppm.domain.timesheet.User;


public class TimeSheetPolicyFactory {
    public TimeSheetValidationPolicy create(User user) {

        switch (user.getCountry()) {
            case PL:
                return new PolishTimeSheetValidationPolicy();
            case IT:
                return new ItalianTimeSheetValidationPolicy();
            case CHE:
                return new SwissTimeSheetValidationPolicy();
            default:
                return new DefaultValidationPolicy();
        }
    }
}
package Specification.ppm.domain.timesheet.services;

import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.timesheet.User.Country;

public class TimeSheetManager {

    public boolean validate(TimeSheet timeSheet) {

        Country country = timeSheet.getUser().getCountry();
        switch (country) {
            case PL:
                return polishValidation(timeSheet);
            case IT:
                return italianValidation(timeSheet);
            case CHE:
                return swissValidation(timeSheet);
            default:
                return defaultValidation(timeSheet);

        }
    }

    private boolean polishValidation(TimeSheet timeSheet) {
        //TODO: validation rules here
        return true;
    }

    private boolean italianValidation(TimeSheet timeSheet) {
        //TODO: validation rules here
        return true;
    }

    private boolean swissValidation(TimeSheet timeSheet) {
        //TODO: validation rules here
        return true;
    }

    private boolean defaultValidation(TimeSheet timeSheet) {
        //TODO: validation rules here
        return true;
    }



}

package Specification.ppm.application.naive;


import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.timesheet.services.TimeSheetManager;
import Specification.sharedkernel.annoations.ApplicationService;
import Specification.ppm.domain.exception.TimeSheetOperationException;
import Specification.ppm.domain.specification.factory.TimeSheetAggregateSpecificationFactory;
import Specification.ppm.domain.timesheet.TimeSheetRepository;

import javax.inject.Inject;

@ApplicationService
public class TimeSheetApplicationService {

    @Inject
    private TimeSheetRepository timeSheetRepository;

    @Inject
    private TimeSheetAggregateSpecificationFactory timeSheetAggregateSpecificationFactory;


    public void approveTimeSheet(Integer timeSheetId) {
        TimeSheet timeSheet = timeSheetRepository.load(timeSheetId);

        // Validate
        boolean validateResult = new TimeSheetManager().validate(timeSheet);
        if(!validateResult) {
            throw new TimeSheetOperationException("Timesheet doesn't fulfil specification to approve", timeSheetId);
        }

        // Domain logic
        timeSheet.approve();

        timeSheetRepository.save(timeSheet);
    }

    //...


    public void createNewTimeSheet(Integer userId) {

    }

    public void addTaskItemToTimeSheet(Integer taskItemId, Integer timeSheetId) {
    }

}

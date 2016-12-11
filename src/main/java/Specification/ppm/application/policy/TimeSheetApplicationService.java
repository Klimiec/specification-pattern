package Specification.ppm.application.policy;


import Specification.ppm.domain.timesheet.TimeSheet;
import Specification.ppm.domain.policies.factory.TimeSheetPolicyFactory;
import Specification.ppm.domain.policies.TimeSheetValidationPolicy;
import Specification.sharedkernel.annoations.ApplicationService;
import Specification.ppm.domain.exception.TimeSheetOperationException;
import Specification.ppm.domain.timesheet.TimeSheetRepository;

import javax.inject.Inject;

@ApplicationService
public class TimeSheetApplicationService {

    @Inject
    private TimeSheetRepository timeSheetRepository;

    @Inject
    private TimeSheetPolicyFactory timeSheetPolicyFactory;


    public void approveTimeSheet(Integer timeSheetId) {
        TimeSheet timeSheet = timeSheetRepository.load(timeSheetId);

        // Validate
        TimeSheetValidationPolicy timeSheetPolic = timeSheetPolicyFactory.create(timeSheet.getUser());
        if(!timeSheetPolic.isSatisfiedBy(timeSheet))
            throw new TimeSheetOperationException("Timesheet doesn't fulfil specification to approve", timeSheetId);
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

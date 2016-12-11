package Specification.ppm.domain.timesheet;


public interface TimeSheetRepository {

    TimeSheet save(TimeSheet timeSheet);

    TimeSheet load(Integer timeSheetId);
}

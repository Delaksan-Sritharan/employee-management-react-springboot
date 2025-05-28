package delaksan.ems_backend.mapper;

import delaksan.ems_backend.dto.EmployeeDto;
import delaksan.ems_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mpaToEmployeeDto(Employee employee){
        return new EmployeeDto(employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }

}

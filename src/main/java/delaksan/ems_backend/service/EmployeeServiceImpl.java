package delaksan.ems_backend.service;

import delaksan.ems_backend.dto.EmployeeDto;
import delaksan.ems_backend.entity.Employee;
import delaksan.ems_backend.mapper.EmployeeMapper;
import delaksan.ems_backend.repository.EmployeeReposiotry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeReposiotry employeeReposiotry;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee createEmployee = employeeReposiotry.save(employee);
        return EmployeeMapper.mpaToEmployeeDto(createEmployee);
    }
}

package delaksan.ems_backend.repository;

import delaksan.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReposiotry extends JpaRepository<Employee,Long> {

}

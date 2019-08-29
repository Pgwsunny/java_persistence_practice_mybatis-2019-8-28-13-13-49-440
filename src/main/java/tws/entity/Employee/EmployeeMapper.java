package tws.entity.Employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import tws.model.Employee;

@Mapper
public interface EmployeeMapper {
//	@Select("Select id,name,age from employee")
	public List<Employee> selectAll();
}

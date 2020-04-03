package jp.co.wisdom_technology.mapper;

import java.util.List;

import jp.co.wisdom_technology.model.Staff;

public interface StaffCustomMapper {
	List<Staff> selectStaffsByDepartment(int department);
	int setTimeUnitForDepartment(Staff staff);
}

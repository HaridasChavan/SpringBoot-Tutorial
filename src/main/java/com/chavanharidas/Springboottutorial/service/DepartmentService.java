package com.chavanharidas.Springboottutorial.service;

import java.util.List;
import java.util.Optional;

import com.chavanharidas.Springboottutorial.entity.Department;
import com.chavanharidas.Springboottutorial.error.DepartmentNotFoundException;


public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	 public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	    public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);


}

package com.chavanharidas.Springboottutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chavanharidas.Springboottutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	public Department findByDepartmentName(String departmentName);

    public List<Department> findByDepartmentNameIgnoreCase(String departmentName);;
}
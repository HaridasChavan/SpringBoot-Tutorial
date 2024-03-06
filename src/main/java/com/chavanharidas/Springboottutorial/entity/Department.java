package com.chavanharidas.Springboottutorial.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@jakarta.persistence.Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	@NotBlank(message = "Please Add Department Name")
	/*
	 * @Length(max=5,min=1)
	 * 
	 * @Size(max=10,min=10)
	 * 
	 * @Email
	 * 
	 * @Negative
	 * 
	 * @PositiveOrZero
	 * 
	 * @NegativeOrZero
	 * 
	 * @Future
	 * 
	 * @FutureOrPresent
	 * 
	 * @Past
	 * 
	 * @PastOrPresent
	 */
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Department(Long departmentId, @NotBlank(message = "Please Add Department Name") String departmentName,
			String departmentAddress, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}

	public Department() {
		super();
	}
	

}
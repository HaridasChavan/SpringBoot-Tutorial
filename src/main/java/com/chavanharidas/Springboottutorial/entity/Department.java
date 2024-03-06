package com.chavanharidas.Springboottutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
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

	public static class Builder {
		private String departmentName;
		private String departmentAddress;
		private String departmentCode;
		private Long departmentId;

		public Builder departmentName(String departmentName) {
			this.departmentName = departmentName;
			return this;
		}

		public Builder departmentAddress(String departmentAddress) {
			this.departmentAddress = departmentAddress;
			return this;
		}

		public Builder departmentCode(String departmentCode) {
			this.departmentCode = departmentCode;
			return this;
		}

		public Builder departmentId(Long departmentId) {
			this.departmentId = departmentId;
			return this;
		}

		public Department build() {
			Department department = new Department();
			department.departmentName = this.departmentName;
			department.departmentAddress = this.departmentAddress;
			department.departmentCode = this.departmentCode;
			department.departmentId = this.departmentId;
			return department;

		}

	}

	public static Builder builder() {
		return new Builder();
	}
}

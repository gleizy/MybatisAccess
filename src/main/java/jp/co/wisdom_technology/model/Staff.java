package jp.co.wisdom_technology.model;

public class Staff {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column staff.id
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column staff.name
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column staff.department
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	private Integer department;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column staff.time_unit
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	private Integer timeUnit;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column staff.id
	 * @return  the value of staff.id
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column staff.id
	 * @param id  the value for staff.id
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column staff.name
	 * @return  the value of staff.name
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column staff.name
	 * @param name  the value for staff.name
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column staff.department
	 * @return  the value of staff.department
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	public Integer getDepartment() {
		return department;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column staff.department
	 * @param department  the value for staff.department
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	public void setDepartment(Integer department) {
		this.department = department;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column staff.time_unit
	 * @return  the value of staff.time_unit
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	public Integer getTimeUnit() {
		return timeUnit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column staff.time_unit
	 * @param timeUnit  the value for staff.time_unit
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	public void setTimeUnit(Integer timeUnit) {
		this.timeUnit = timeUnit;
	}
}
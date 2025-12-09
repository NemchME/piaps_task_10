public class Employee {

	public int id;
	public String name;
	public String phone;
	public String position;
	private float salary;

	public String getPhone() {
		return this.phone;
	}

	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public void getSalary() {
		// TODO - implement Employee.getSalary
		throw new UnsupportedOperationException();
	}

	public void setSalary() {
		// TODO - implement Employee.setSalary
		throw new UnsupportedOperationException();
	}

}
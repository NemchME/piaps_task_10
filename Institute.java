public class Institute {

	public String name;
	public String address;
	public Faculty faculties;
	public ResearchAssociate employees;

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

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 * @param faculty
	 */
	public void addFaculty(Faculty faculty) {
		// TODO - implement Institute.addFaculty
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param faculty
	 */
	public void removeFaculty(Faculty faculty) {
		// TODO - implement Institute.removeFaculty
		throw new UnsupportedOperationException();
	}

}
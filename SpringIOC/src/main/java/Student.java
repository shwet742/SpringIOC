
public class Student {

	
	public Student() {

	}
	private long stu_id;
	private String stu_name;
	private Address address;
	
	public long getStu_id() {
		return stu_id;
	}
	public void setStu_id(long stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", address=" + address + "]";
	}
	
	
	
	
}

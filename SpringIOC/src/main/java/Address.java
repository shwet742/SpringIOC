
public class Address {

	public Address() {
		super();
	}
	private String city;
	private String State;
	private long pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", pincode=" + pincode + "]";
	}
	
	
}

package restaurant.domain;

public class Restaurant {
	
	private int id;
	private String name;
	private String address;
	private String telephone_number;
	
	public Restaurant(String name, String address, String telephone_number) {
		super();
		this.name = name;
		this.address = address;
		this.telephone_number = telephone_number;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone_number() {
		return telephone_number;
	}
	public void setTelephone_number(String telephone_number) {
		this.telephone_number = telephone_number;
	}
	
	

}


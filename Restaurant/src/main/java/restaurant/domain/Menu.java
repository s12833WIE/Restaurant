package restaurant.domain;

public class Menu {
	
	private int id;
	private String menu_type;
	
	public Menu(String menu_type) {
		super();
		this.menu_type = menu_type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMenu_type() {
		return menu_type;
	}
	public void setMenu_type(String menu_type) {
		this.menu_type = menu_type;
	}
	
	

}

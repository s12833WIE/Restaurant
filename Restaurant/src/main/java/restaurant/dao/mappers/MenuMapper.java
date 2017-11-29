package restaurant.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import restaurant.domain.Menu;

public class MenuMapper implements IMapper<Menu>{
	
	public Menu map(ResultSet rs) throws SQLException {
		Menu menu = new Menu();
		Menu.setId(rs.getInt("id"));
		Menu.setMenu_type(rs.getString("menu_type"));
		return menu;
	}
}

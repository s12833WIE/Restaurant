package restaurant.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import restaurant.domain.Restaurant;

public class RestaurantMapper implements IMapper<Restaurant>{
	
		public Restaurant map(ResultSet rs) throws SQLException {
			Restaurant restaurant = new Restaurant();
			Restaurant.setId(rs.getInt("id"));
			Restaurant.setName(rs.getString("name"));
			Restaurant.setAddress(rs.getString("address"));
			Restaurant.setTelephone_number(rs.getString("telephone_number"));
			return restaurant;
			
		}
}

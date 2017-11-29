package restaurant.dao.mappers;

import restaurant.domain.Food;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodMapper implements IMapper<Food>{
	
		public Food map(ResultSet rs) throws SQLException {
			Food food = new Food();
			Food.setId(rs.getInt("id"));
			Food.setName(rs.getString("name"));
			Food.setDescription(rs.getString("description"));
			Food.setPrice(rs.getString("price"));
			return food;
			
		}
}

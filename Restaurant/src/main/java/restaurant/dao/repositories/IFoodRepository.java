package restaurant.dao.repositories;

import restaurant.domain.Food;
import java.util.List;

public interface IFoodRepository extends IRepository<Food>{
	
	public List<Food> withName(String name);
	public List<Food> withDescription(String description);
	public List<Food> withPrice(String price);

}

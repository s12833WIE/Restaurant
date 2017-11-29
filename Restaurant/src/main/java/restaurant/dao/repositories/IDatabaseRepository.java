package restaurant.dao.repositories;

import java.sql.SQLException;

public class IDatabaseRepository {

	public interface IDatabaseCatalog {
		public IFoodRepository authors();
		public IMenuRepository borrowingOrders();
		public IRestaurantRepository reservationOrders();
		
		public void saveChanges();
		
	}
	
}

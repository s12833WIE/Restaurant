package restaurant.dao.repositories;

import restaurant.domain.Restaurant;

import java.util.List;

public interface IRestaurantRepository extends IRepository<Restaurant>{

	public List<Restaurant> withName(String name);
	public List<Restaurant> withAddress(String address);
	public List<Restaurant> withTelephone_number(String telephone_number);
	
}

package restaurant.dao.repositories;

import java.util.List;
import restaurant.domain.Menu;


public interface IMenuRepository extends IRepository<Menu>{
	
	public List<Menu> withMenu_type(String menu_type);

}

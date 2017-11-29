package restaurant.dao.uow;

import restaurant.dao.uow.Entity;

public interface IUnitOfWorkRepository {

	public void persistAdd(Entity entity);
	public void persistUpdate(Entity entity);
	public void persistDelete(Entity entity);
}

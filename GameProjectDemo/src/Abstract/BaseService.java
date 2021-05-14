package Abstract;
import Entities.Entity;

public interface BaseService {
	void add(Entity entity);
	void delete(Entity entity);
	void update(Entity entity);
}

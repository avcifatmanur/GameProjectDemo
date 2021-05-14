package Concrete;

import Abstract.BaseService;
import Entities.Entity;

public class BaseManager implements BaseService{

	@Override
	public void add(Entity entity) {
		System.out.println(entity.getName()+" eklendi!");
	}

	@Override
	public void delete(Entity entity) {
		System.out.println(entity.getName()+" silindi!");		
	}

	@Override
	public void update(Entity entity) {
		System.out.println(entity.getName()+" güncellendi!");		
	}
}

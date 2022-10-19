package kodlamaioWithNLayerApp.dataAccess.hibernate;

import kodlamaioWithNLayerApp.dataAccess.IEducatorDao;
import kodlamaioWithNLayerApp.entities.Educator;

public class HibernateEducatorDao implements IEducatorDao {
	public void add(Educator educator) {
		System.out.println(educator.getfName() + " İsimli eğitmen Hibernate ile eklendi.");
	}
}

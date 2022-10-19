package kodlamaioWithNLayerApp.dataAccess.jdbc;

import kodlamaioWithNLayerApp.dataAccess.IEducatorDao;
import kodlamaioWithNLayerApp.entities.Educator;

public class JdbcEducatorDao implements IEducatorDao{
	public void add(Educator educator) {
		System.out.println(educator.getfName() + " İsimli eğitmen Jdbc ile eklendi.");
	}
}

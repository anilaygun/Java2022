package kodlamaioWithNLayerApp.dataAccess.jdbc;

import kodlamaioWithNLayerApp.dataAccess.ICourseDao;
import kodlamaioWithNLayerApp.entities.Course;

public class JdbcCourseDao implements ICourseDao {
	public void add(Course course) {
		System.out.println(course.getCourseName() + " Kursu Jdbc ile eklendi.");
	}

}

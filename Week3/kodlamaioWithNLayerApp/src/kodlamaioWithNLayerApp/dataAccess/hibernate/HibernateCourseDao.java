package kodlamaioWithNLayerApp.dataAccess.hibernate;

import kodlamaioWithNLayerApp.dataAccess.ICourseDao;
import kodlamaioWithNLayerApp.entities.Course;

public class HibernateCourseDao implements ICourseDao {
	public void add(Course course) {
		System.out.println(course.getCourseName() + " Kursu Hibernate ile eklendi.");
	}
}

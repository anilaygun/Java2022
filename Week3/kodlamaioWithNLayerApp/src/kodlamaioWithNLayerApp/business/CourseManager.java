package kodlamaioWithNLayerApp.business;

import kodlamaioWithNLayerApp.core.logging.ILogger;
import kodlamaioWithNLayerApp.dataAccess.ICourseDao;
import kodlamaioWithNLayerApp.dataAccess.hibernate.HibernateCourseDao;
import kodlamaioWithNLayerApp.dataAccess.jdbc.JdbcCourseDao;
import kodlamaioWithNLayerApp.entities.Course;

public class CourseManager {
	private ICourseDao iCourseDao;
	private ILogger[] loggers;

	public CourseManager(ICourseDao iCourseDao, ILogger[] loggers) {
		this.iCourseDao = iCourseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getUnitPrice() <= 0) {
			throw new Exception("Ürün fiyatı geçersiz.");
		}
		
		
		
		
		/// HATA KURS İSMİ
		/*
		 * for (Course courses : course) { if
		 * (course.getCourseName().equalsIgnoreCase(course.getCourseName())) { throw new
		 * Exception("Kurs ismi aynı olamaz."); } }
		 * 
		 * 
		 * try { if (course.getUnitPrice() <= 0) ; } catch (Exception e) {
		 * System.out.println(e.getMessage()+ "Kursun fiytı 0 dan büyük olmalıdır!"); }
		 * 
		 * try { if (course.getCourseName().equalsIgnoreCase(course.getCourseName())) ;
		 * } catch (Exception e) { System.out.println("Kurs ismi aynı olamaz"); }
		 */

		iCourseDao.add(course);
		for (ILogger iLogger : loggers) {
			iLogger.log(course.getCourseName());
		}
	}
}

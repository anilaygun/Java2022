package kodlamaioWithNLayerApp.business;

import java.lang.System.Logger;
import java.util.List;

import kodlamaioWithNLayerApp.core.logging.ILogger;
import kodlamaioWithNLayerApp.dataAccess.IEducatorDao;
import kodlamaioWithNLayerApp.entities.Course;
import kodlamaioWithNLayerApp.entities.Educator;

public class EducatorManager {
	private IEducatorDao iEducatorDao;
	private ILogger[] loggers;
	private List<Educator> educators;

	public EducatorManager(IEducatorDao iEducatorDao, ILogger[] loggers, List<Educator> educators) {
		this.iEducatorDao = iEducatorDao;
		this.loggers = loggers;
		this.educators = educators;
	}

	public void add(Educator educator) throws Exception {

		for (Educator educator1 : educators) {
			if (educator1.getfName() == educator1.getfName()) {
				throw new Exception("Aynı kategori ismi kullanılamaz");
			}

			/*
			 * if (educator.getfName().equalsIgnoreCase(educator1.getfName())) { /// HATA
			 * throw new Exception("Eğitmen adı aynı olamaz."); }
			 */
			iEducatorDao.add(educator1);
			for (ILogger iLogger : loggers) {
				iLogger.log(educator1.getfName() + " " + educator1.getlName());
			}

			// İŞ KURALLARI
		}
	}
}

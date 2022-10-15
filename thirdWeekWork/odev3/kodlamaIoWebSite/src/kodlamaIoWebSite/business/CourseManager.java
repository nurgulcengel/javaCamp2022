package kodlamaIoWebSite.business;

import java.util.List;

import kodlamaIoWebSite.core.logging.ILogger;
import kodlamaIoWebSite.dataAccess.ICourseDao;
import kodlamaIoWebSite.entities.Course;

public class CourseManager {

	private ICourseDao courseDao;
	private List<ILogger> loggers;
	private List<Course> courses;

	public CourseManager(ICourseDao courseDao, List<ILogger> loggers, List<Course> courses) {

		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {

		// iş kuralları

		for (Course c : courses) {

			if (c.getName() == course.getName()) {
				throw new Exception("Bu kurs ismi zaten mevcut!");
			}

		}

		if (course.getPrice() < 0) {

			throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
		}
		
		
		courseDao.add(course);
		courses.add(course);
		
		
		for (ILogger logger : loggers) {

			logger.log(course.getName());
		}

	}

}

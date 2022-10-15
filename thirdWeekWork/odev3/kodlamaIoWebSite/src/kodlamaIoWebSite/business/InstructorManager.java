package kodlamaIoWebSite.business;

import java.util.List;

import kodlamaIoWebSite.core.logging.ILogger;
import kodlamaIoWebSite.dataAccess.IInstructorDao;
import kodlamaIoWebSite.entities.Instructor;

public class InstructorManager {

	private List<Instructor> instructors;
	private List<ILogger> loggers;
	private IInstructorDao instractorDao;

	public InstructorManager(List<Instructor> instructors, List<ILogger> loggers, IInstructorDao instractorDao) {

		this.instructors = instructors;
		this.loggers = loggers;
		this.instractorDao = instractorDao;
	}

	public void add(Instructor instructor) {

//iş kuralı

		instractorDao.add(instructor);

		for (ILogger logger : loggers) {

			logger.log(instructor.getName());
		}

	}

}

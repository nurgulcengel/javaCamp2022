package kodlamaIoWebSite.dataAccess;

import kodlamaIoWebSite.entities.Course;

public interface ICourseDao {

	void add(Course course);

	void delete(Course course);

	void update(Course course);

}

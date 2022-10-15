package kodlamaIoWebSite.dataAccess;

import kodlamaIoWebSite.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
	
		System.out.println("Jdbc ile eğitmen veritabanına eklendi");
	}

}

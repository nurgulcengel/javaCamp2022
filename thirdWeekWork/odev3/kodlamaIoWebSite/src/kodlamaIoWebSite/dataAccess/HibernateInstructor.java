package kodlamaIoWebSite.dataAccess;

import kodlamaIoWebSite.entities.Instructor;

public class HibernateInstructor implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
	
		System.out.println("Hibernate ile eğitmen veritabanına eklendi");
		
	}

}

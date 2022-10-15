package kodlamaIoWebSite.dataAccess;


import kodlamaIoWebSite.entities.Course;

public class jdbcCourseDao implements ICourseDao {

	public void add(Course course) {
		
		System.out.println("Jdbc ile veritabanına eklendi.");
	}
	
	
public void delete(Course course) {
		
		System.out.println("Jdbc ile veritabanından silindi.");
	}


public void update(Course course) {
	
	System.out.println("Jdbc ile güncelleme yapıldı.");
}



	
	
	
}

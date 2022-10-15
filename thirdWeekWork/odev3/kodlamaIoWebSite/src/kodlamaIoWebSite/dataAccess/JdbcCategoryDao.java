package kodlamaIoWebSite.dataAccess;

import kodlamaIoWebSite.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Jdbc ile categori veritabanına eklendi.");
		
	}


}

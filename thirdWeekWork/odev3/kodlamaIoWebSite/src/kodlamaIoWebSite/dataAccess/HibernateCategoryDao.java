package kodlamaIoWebSite.dataAccess;

import kodlamaIoWebSite.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Hibernate ile categori veritabanına eklendi.");
		
	}




}

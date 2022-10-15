package kodlamaIoWebSite.business;

import java.util.List;

import kodlamaIoWebSite.core.logging.ILogger;
import kodlamaIoWebSite.dataAccess.ICategoryDao;
import kodlamaIoWebSite.entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private List<ILogger> loggers;
	private List<Category> categories;

	public CategoryManager(ICategoryDao categoryDao, List<ILogger> loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

public	void add(Category category) throws Exception {

		for (Category c : categories) {

			if (c.getName() == category.getName()) {

				throw new Exception("Bu isimde category mevcut!");
			}

		}

		categoryDao.add(category);
		categories.add(category);

		for (ILogger logger : loggers) {

			logger.log(category.getName());
		}

	}
}

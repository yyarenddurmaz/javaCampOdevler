package kodlamaioDemo.business;



import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
    private CategoryDao CategoryDao;
    private Logger[] loggers;
    private Logger[] categories;

    public CategoryManager(CategoryDao iCategoryDao, Logger[] loggers, Logger[] categories) {
        this.CategoryDao = iCategoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Logger categories: categories) {
            if(categories.getName() == category.getName() ){
                throw new Exception("Categories with the same name cannot be entered");
            }
        }
        CategoryDao.add(category);
        categories.add(category);

        for (Logger logger: loggers){
            logger.Log(category.getName());
        }
    }
}

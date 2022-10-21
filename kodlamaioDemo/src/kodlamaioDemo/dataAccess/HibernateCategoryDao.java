package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Added to database with Hibernate");
    }
}

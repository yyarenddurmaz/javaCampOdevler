package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Added to database with Hibernate");
    }
}

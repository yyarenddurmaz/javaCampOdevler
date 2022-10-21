package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.JdbcInstructorDao;
import kodlamaioDemo.entities.Instructor;

public class InstructorManager {
    private JdbcInstructorDao InstructorDao;
    private Logger[] loggers;

    public InstructorManager(JdbcInstructorDao InstructorDao, Logger[] loggers) {
        this.InstructorDao = InstructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        for (Logger logger : loggers) {
            logger.Log(instructor.getFirstName()+" "+instructor.getLastName());
        }

        InstructorDao.add(instructor);
    }
}
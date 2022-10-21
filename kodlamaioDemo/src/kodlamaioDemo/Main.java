package kodlamaioDemo;

import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.core.logging.MailLogger;
import kodlamaioDemo.dataAccess.HibernateCourseDao;
import kodlamaioDemo.dataAccess.JdbcCourseDao;
import kodlamaioDemo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, "Java2022", 59.99);
		
		Logger[] loggers= {};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course1);
	}

}

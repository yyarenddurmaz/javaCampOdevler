package kodlamaioDemo.business;



import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.dataAccess.HibernateCourseDao;
import kodlamaioDemo.dataAccess.JdbcCourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;


	public CourseManager(CourseDao courseDao, Logger[] logger) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("ürün fiyatı 0'dan küçük olamaz!");
		}
		courseDao.add(course);
		
		for(Logger logger: loggers) {
			logger.Log(course.getName());
		}
		
	}
}
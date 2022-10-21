package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("jdbc ile eklendi.");
	}
}

package kodlamaioDemo.entities;

public class Course {
	private int code;
	private String name;
	private double coursePrice;

	public Course() {

	}

	public Course(int code, String name, double coursePrice) {

		this.code = code;
		this.name = name;
		this.coursePrice = coursePrice;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

}

package gr.haec.AcademicManager;

public class Course {
	
	private int courseID;
	private String title;
	private String startDate;
	private String endDate;
	private String status;
	private int totalHours;
	private String timeAndDays;
	private String description;
	private String syllabus;
	private int prereqCourseID;
	private int cost;
	private int discount;
	private String classroom;
	private int maxStudents;
	private int minStudents;
	private int credits;
	
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	public String getTimeAndDays() {
		return timeAndDays;
	}
	public void setTimeAndDays(String timeAndDays) {
		this.timeAndDays = timeAndDays;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSyllabus() {
		return syllabus;
	}
	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}
	public int getPrereqCourseID() {
		return prereqCourseID;
	}
	public void setPrereqCourseID(int prereqCourseID) {
		this.prereqCourseID = prereqCourseID;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public int getMinStudents() {
		return minStudents;
	}
	public void setMinStudents(int minStudents) {
		this.minStudents = minStudents;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}

}

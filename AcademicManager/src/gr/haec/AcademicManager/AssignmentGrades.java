package gr.haec.AcademicManager;

public class AssignmentGrades {
	
	private int assignmentID;
	private int studentID;
	private double grades;
	private String submitDay;
	private String answer;
	
	public int getAssignmentID() {
		return assignmentID;
	}
	public void setAssignmentID(int assignmentID) {
		this.assignmentID = assignmentID;
	}	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public double getGrades() {
		return grades;
	}
	public void setGrades(double grades) {
		this.grades = grades;
	}
	public String getSubmitDay() {
		return submitDay;
	}
	public void setSubmitDay(String submitDay) {
		this.submitDay = submitDay;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}


}

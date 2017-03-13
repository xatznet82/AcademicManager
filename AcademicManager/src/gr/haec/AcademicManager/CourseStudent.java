package gr.haec.AcademicManager;

public class CourseStudent {
	
	private int studentID;
	private int courseID;
	private String evaluation;
	private float assignmentGrades;
	private float finalGrades;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	public float getAssignmentGrades() {
		return assignmentGrades;
	}
	public void setAssignmentGrades(float assignmentGrades) {
		this.assignmentGrades = assignmentGrades;
	}
	public float getFinalGrades() {
		return finalGrades;
	}
	public void setFinalGrades(float finalGrades) {
		this.finalGrades = finalGrades;
	}
	

}

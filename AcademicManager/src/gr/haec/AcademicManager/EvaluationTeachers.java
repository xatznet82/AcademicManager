package gr.haec.AcademicManager;

public class EvaluationTeachers {
	
	private int teacherID;
	private int studentID;
	private int courseID;
	private String evaluation;
	
	
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
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
	
	

}

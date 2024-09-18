package bean;
import java.io.Serializable;

public class Grades implements Serializable {

    private String gradesId;       // grades_id: varchar
    private String entYear;        // ent_year: varchar
    private char academicYear;     // academic_year: char
    private String month;          // month: varchar
    private char subjectId;        // subject_id: char
    private String studentId;      // student_id: varchar
    private int score;             // score: int

    // コンストラクタ
    public Grades() {}

    // getterとsetter
    public String getGradesId() {
        return gradesId;
    }

    public void setGradesId(String gradesId) {
        this.gradesId = gradesId;
    }

    public String getEntYear() {
        return entYear;
    }

    public void setEntYear(String entYear) {
        this.entYear = entYear;
    }

    public char getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(char academicYear) {
        this.academicYear = academicYear;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public char getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(char subjectId) {
        this.subjectId = subjectId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // toStringメソッド（オプション）
    @Override
    public String toString() {
        return "GradesBean{" +
                "gradesId='" + gradesId + '\'' +
                ", entYear='" + entYear + '\'' +
                ", academicYear=" + academicYear +
                ", month='" + month + '\'' +
                ", subjectId=" + subjectId +
                ", studentId='" + studentId + '\'' +
                ", score=" + score +
                '}';
    }
}

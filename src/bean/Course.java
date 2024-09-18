package bean;
import java.io.Serializable;

public class Course implements Serializable {

    private char courseId;       // course_id: char
    private String courseName;   // course_name: varchar

    // コンストラクタ
    public Course() {}

    // getterとsetter
    public char getCourseId() {
        return courseId;
    }

    public void setCourseId(char courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // toStringメソッド（オプション）
    @Override
    public String toString() {
        return "CourseBean{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}

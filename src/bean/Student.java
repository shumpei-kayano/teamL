package bean;
import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

    private String studentId;        // student_id: varchar
    private String studentName;      // student_name: varchar
    private String classNum;           // class_num: char
    private String entYear;            // ent_year: char
    private String courseId;           // course_id: char
    private Date dropoutDate;        // dropout_date: date
    private Date kunkokuDate;        // kunkoku_date: date
    private Date kaikokuDate;        // kaikoku_date: date
    private Date saikaikokuDate;     // saikaikoku_date: date
    private Date taigakuKankokuDate; // taigakukankoku_date: date
    private Date tokutaigakuDate;    // tokutaigaku_date: date

    // コンストラクタ
    public Student() {}

    // getterとsetter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getEntYear() {
        return entYear;
    }

    public void setEntYear(String entYear) {
        this.entYear = entYear;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Date getDropoutDate() {
        return dropoutDate;
    }

    public void setDropoutDate(Date dropoutDate) {
        this.dropoutDate = dropoutDate;
    }

    public Date getKunkokuDate() {
        return kunkokuDate;
    }

    public void setKunkokuDate(Date kunkokuDate) {
        this.kunkokuDate = kunkokuDate;
    }

    public Date getKaikokuDate() {
        return kaikokuDate;
    }

    public void setKaikokuDate(Date kaikokuDate) {
        this.kaikokuDate = kaikokuDate;
    }

    public Date getSaikaikokuDate() {
        return saikaikokuDate;
    }

    public void setSaikaikokuDate(Date saikaikokuDate) {
        this.saikaikokuDate = saikaikokuDate;
    }

    public Date getTaigakuKankokuDate() {
        return taigakuKankokuDate;
    }

    public void setTaigakuKankokuDate(Date taigakuKankokuDate) {
        this.taigakuKankokuDate = taigakuKankokuDate;
    }

    public Date getTokutaigakuDate() {
        return tokutaigakuDate;
    }

    public void setTokutaigakuDate(Date tokutaigakuDate) {
        this.tokutaigakuDate = tokutaigakuDate;
    }

    // toStringメソッド（オプション）
    @Override
    public String toString() {
        return "StudentBean{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", classNum=" + classNum +
                ", entYear=" + entYear +
                ", courseId=" + courseId +
                ", dropoutDate=" + dropoutDate +
                ", kunkokuDate=" + kunkokuDate +
                ", kaikokuDate=" + kaikokuDate +
                ", saikaikokuDate=" + saikaikokuDate +
                ", taigakuKankokuDate=" + taigakuKankokuDate +
                ", tokutaigakuDate=" + tokutaigakuDate +
                '}';
    }
}

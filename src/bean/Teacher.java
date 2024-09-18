package bean;
import java.io.Serializable;
import java.util.Date;

public class Teacher implements Serializable {

    private String teacherId;     // teacher_id: varchar
    private String teacherName;   // teacher_name: varchar
    private char classNum;        // class_num: char
    private String loginId;       // login_id: varchar
    private String password;      // password: varchar
    private Boolean grantFlg;     // grant_flg: Boolean
    private Boolean deadlineSetFlg; // deadline_set_flg: Boolean
    private Date deadline;        // deadline: date

    // コンストラクタ
    public Teacher() {}

    // getterとsetter
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public char getClassNum() {
        return classNum;
    }

    public void setClassNum(char classNum) {
        this.classNum = classNum;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getGrantFlg() {
        return grantFlg;
    }

    public void setGrantFlg(Boolean grantFlg) {
        this.grantFlg = grantFlg;
    }

    public Boolean getDeadlineSetFlg() {
        return deadlineSetFlg;
    }

    public void setDeadlineSetFlg(Boolean deadlineSetFlg) {
        this.deadlineSetFlg = deadlineSetFlg;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    // toStringメソッド（オプション）
    @Override
    public String toString() {
        return "TeacherBean{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", classNum=" + classNum +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", grantFlg=" + grantFlg +
                ", deadlineSetFlg=" + deadlineSetFlg +
                ", deadline=" + deadline +
                '}';
    }
}

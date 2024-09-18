package bean;
import java.io.Serializable;

public class Subject implements Serializable {

    private char subjectId;        // subject_id: char
    private char academicYear;     // academic_year: char
    private String subjectName;    // subject_name: varchar
    private Boolean requiredFlg;   // required_flg: Boolean
    private int credit;            // credit: int
    private int time;              // time: int

    // コンストラクタ
    public Subject() {}

    // getterとsetter
    public char getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(char subjectId) {
        this.subjectId = subjectId;
    }

    public char getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(char academicYear) {
        this.academicYear = academicYear;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Boolean getRequiredFlg() {
        return requiredFlg;
    }

    public void setRequiredFlg(Boolean requiredFlg) {
        this.requiredFlg = requiredFlg;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    // toStringメソッド（オプション）
    @Override
    public String toString() {
        return "SubjectBean{" +
                "subjectId=" + subjectId +
                ", academicYear=" + academicYear +
                ", subjectName='" + subjectName + '\'' +
                ", requiredFlg=" + requiredFlg +
                ", credit=" + credit +
                ", time=" + time +
                '}';
    }
}

package bean;
import java.io.Serializable;
import java.util.Date;


public class Delinquent implements Serializable {

    private String delinquentId;   // delinquent_id: varchar
    private String studentId;      // student_id: varchar
    private Date delinquentDate;   // delinquent_date: date
    private String conditionId;      // condition_id: char

    // コンストラクタ
    public Delinquent() {}

    // getterとsetter
    public String getDelinquentId() {
        return delinquentId;
    }

    public void setDelinquentId(String delinquentId) {
        this.delinquentId = delinquentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getDelinquentDate() {
        return delinquentDate;
    }

    public void setDelinquentDate(Date delinquentDate) {
        this.delinquentDate = delinquentDate;
    }

    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    // toStringメソッド（オプション）
    @Override
    public String toString() {
        return "DelinquentBean{" +
                "delinquentId='" + delinquentId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", delinquentDate=" + delinquentDate +
                ", conditionId=" + conditionId +
                '}';
    }
}

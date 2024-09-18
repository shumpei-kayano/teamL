package bean;
import java.io.Serializable;
import java.util.Date;

public class LeadingRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    private String leadingRecordId;   // leading_record_id: varchar
    private String studentId;         // student_id: varchar
    private Date leadingDate;         // leading_date: date
    private String leadingContent;    // leading_content: text
    private String teacherId;         // teacher_id: varchar

    // コンストラクタ
    public LeadingRecord() {}

    // getterとsetter
    public String getLeadingRecordId() {
        return leadingRecordId;
    }

    public void setLeadingRecordId(String leadingRecordId) {
        this.leadingRecordId = leadingRecordId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getLeadingDate() {
        return leadingDate;
    }

    public void setLeadingDate(Date leadingDate) {
        this.leadingDate = leadingDate;
    }

    public String getLeadingContent() {
        return leadingContent;
    }

    public void setLeadingContent(String leadingContent) {
        this.leadingContent = leadingContent;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    // toStringメソッド（オプション）
    @Override
    public String toString() {
        return "LeadingRecordBean{" +
                "leadingRecordId='" + leadingRecordId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", leadingDate=" + leadingDate +
                ", leadingContent='" + leadingContent + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }
}

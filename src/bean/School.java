package bean;
import java.io.Serializable;

public class School implements Serializable {
    private static final long serialVersionUID = 1L;

    private String schoolId;    // school_id: varchar
    private String schoolName;  // school_name: varchar

    // コンストラクタ
    public School() {}

    // getterとsetter
    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // toStringメソッド（オプション）
    @Override
    public String toString() {
        return "SchoolBean{" +
                "schoolId='" + schoolId + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

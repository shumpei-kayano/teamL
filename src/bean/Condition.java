package bean;
import java.io.Serializable;

public class Condition implements Serializable {

    private char conditionId;       // condition_id: char
    private String condition;       // condition: varchar

    // コンストラクタ
    public Condition() {}

    // getterとsetter
    public char getConditionId() {
        return conditionId;
    }

    public void setConditionId(char conditionId) {
        this.conditionId = conditionId;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    // toStringメソッド（オプション）
    @Override
    public String toString() {
        return "ConditionBean{" +
                "conditionId=" + conditionId +
                ", condition='" + condition + '\'' +
                '}';
    }
}

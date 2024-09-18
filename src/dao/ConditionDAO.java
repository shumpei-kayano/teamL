package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Condition;

public class ConditionDAO extends DAO {
    private Connection connection;

    // コンストラクタ
    public ConditionDAO(Connection connection) {
        this.connection = connection;
    }

    // 全件取得
    public List<Condition> getAllConditions() throws SQLException {
        List<Condition> conditions = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM conditions");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Condition condition = new Condition();
                condition.setConditionId(rs.getString("condition_id"));
                condition.setCondition(rs.getString("condition"));
                conditions.add(condition);
            }
            stmt.close();
        }

		connection.close();

        return conditions;
    }

    // 追加
    public void createCondition(Condition condition) throws SQLException {
        String query = "INSERT INTO conditions (condition_id, condition) VALUES (?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, condition.getConditionId());
            pstmt.setString(2, condition.getCondition());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // １件取得
    public Condition getConditionById(String conditionId) throws SQLException {
        String query = "SELECT * FROM conditions WHERE condition_id = ?";
        Condition condition = null;

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, conditionId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    condition = new Condition();
                    condition.setConditionId(rs.getString("condition_id"));
                    condition.setCondition(rs.getString("condition"));
                }
            }
            pstmt.close();
        }

		connection.close();

        return condition;
    }

    // 更新
    public void updateCondition(Condition condition) throws SQLException {
        String query = "UPDATE conditions SET condition = ? WHERE condition_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, condition.getCondition());
            pstmt.setString(2, condition.getConditionId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 削除
    public void deleteCondition(String conditionId) throws SQLException {
        String query = "DELETE FROM conditions WHERE condition_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, conditionId);
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Delinquent;

public class DelinquentDAO extends DAO {
    private Connection connection;

    // コンストラクタ
    public DelinquentDAO(Connection connection) {
        this.connection = connection;
    }

    // 全件取得
    public List<Delinquent> getAllDelinquents() throws SQLException {
        List<Delinquent> delinquents = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM delinquents");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Delinquent delinquent = new Delinquent();
                delinquent.setDelinquentId(rs.getString("delinquent_id"));
                delinquent.setStudentId(rs.getString("student_id"));
                delinquent.setDelinquentDate(rs.getDate("delinquent_date"));
                delinquent.setConditionId(rs.getString("condition_id"));
                delinquents.add(delinquent);
            }
            stmt.close();
        }

		connection.close();

        return delinquents;
    }

    // 出欠記録１件の追加
    public void createDelinquent(Delinquent delinquent) throws SQLException {
        String query = "INSERT INTO delinquents (delinquent_id, student_id, delinquent_date, condition_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, delinquent.getDelinquentId());
            pstmt.setString(2, delinquent.getStudentId());
            pstmt.setDate(3, new java.sql.Date(delinquent.getDelinquentDate().getTime()));
            pstmt.setString(4, delinquent.getConditionId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 出欠記録の取得
    public Delinquent getDelinquentById(String delinquentId) throws SQLException {
        String query = "SELECT * FROM delinquents WHERE delinquent_id = ?";
        Delinquent delinquent = null;

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, delinquentId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    delinquent = new Delinquent();
                    delinquent.setDelinquentId(rs.getString("delinquent_id"));
                    delinquent.setStudentId(rs.getString("student_id"));
                    delinquent.setDelinquentDate(rs.getDate("delinquent_date"));
                    delinquent.setConditionId(rs.getString("condition_id"));
                }
            }
            pstmt.close();
        }

		connection.close();

        return delinquent;
    }

    // 出欠記録の更新
    public void updateDelinquent(Delinquent delinquent) throws SQLException {
        String query = "UPDATE delinquents SET student_id = ?, delinquent_date = ?, condition_id = ? WHERE delinquent_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, delinquent.getStudentId());
            pstmt.setDate(2, new java.sql.Date(delinquent.getDelinquentDate().getTime()));
            pstmt.setString(3, delinquent.getConditionId());
            pstmt.setString(4, delinquent.getDelinquentId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 出欠記録の削除
    public void deleteDelinquent(String delinquentId) throws SQLException {
        String query = "DELETE FROM delinquents WHERE delinquent_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, delinquentId);
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.LeadingRecord;

public class LeadingRecordDAO extends DAO {
    private Connection connection;

    // コンストラクタ
    public LeadingRecordDAO(Connection connection) {
        this.connection = connection;
    }

    // 全件取得
    public List<LeadingRecord> getAllLeadingRecords() throws SQLException {
        List<LeadingRecord> leadingRecords = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM leading_records");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                LeadingRecord record = new LeadingRecord();
                record.setLeadingRecordId(rs.getString("leading_record_id"));
                record.setStudentId(rs.getString("student_id"));
                record.setLeadingDate(rs.getDate("leading_date"));
                record.setLeadingContent(rs.getString("leading_content"));
                record.setTeacherId(rs.getString("teacher_id"));
                leadingRecords.add(record);
            }
            stmt.close();
        }

		connection.close();

        return leadingRecords;
    }

    // 指導記録の追加
    public void createLeadingRecord(LeadingRecord record) throws SQLException {
        String query = "INSERT INTO leading_records (leading_record_id, student_id, leading_date, leading_content, teacher_id) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, record.getLeadingRecordId());
            pstmt.setString(2, record.getStudentId());
            pstmt.setDate(3, new java.sql.Date(record.getLeadingDate().getTime()));
            pstmt.setString(4, record.getLeadingContent());
            pstmt.setString(5, record.getTeacherId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 指導記録１件の取得
    public LeadingRecord getLeadingRecordById(String leadingRecordId) throws SQLException {
        String query = "SELECT * FROM leading_records WHERE leading_record_id = ?";
        LeadingRecord record = null;

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, leadingRecordId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    record = new LeadingRecord();
                    record.setLeadingRecordId(rs.getString("leading_record_id"));
                    record.setStudentId(rs.getString("student_id"));
                    record.setLeadingDate(rs.getDate("leading_date"));
                    record.setLeadingContent(rs.getString("leading_content"));
                    record.setTeacherId(rs.getString("teacher_id"));
                }
            }
            pstmt.close();
        }

		connection.close();

        return record;
    }

    // 指導記録の更新
    public void updateLeadingRecord(LeadingRecord record) throws SQLException {
        String query = "UPDATE leading_records SET student_id = ?, leading_date = ?, leading_content = ?, teacher_id = ? WHERE leading_record_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, record.getStudentId());
            pstmt.setDate(2, new java.sql.Date(record.getLeadingDate().getTime()));
            pstmt.setString(3, record.getLeadingContent());
            pstmt.setString(4, record.getTeacherId());
            pstmt.setString(5, record.getLeadingRecordId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 指導記録の削除
    public void deleteLeadingRecord(String leadingRecordId) throws SQLException {
        String query = "DELETE FROM leading_records WHERE leading_record_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, leadingRecordId);
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }
}

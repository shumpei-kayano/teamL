package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Subject;

public class SubjectDAO extends DAO {
    private Connection connection;

    // コンストラクタ
    public SubjectDAO(Connection connection) {
        this.connection = connection;
    }

    // 全件取得
    public List<Subject> getAllSubjects() throws SQLException {
        List<Subject> subjects = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM subjects");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Subject subject = new Subject();
                subject.setSubjectId(rs.getString("subject_id"));
                subject.setAcademicYear(rs.getString("academic_year"));
                subject.setSubjectName(rs.getString("subject_name"));
                subject.setRequiredFlg(rs.getBoolean("required_flg"));
                subject.setCredit(rs.getInt("credit"));
                subject.setTime(rs.getInt("time"));
                subjects.add(subject);
            }
            stmt.close();
        }

		connection.close();

        return subjects;
    }

    // 科目の追加
    public void createSubject(Subject subject) throws SQLException {
        String query = "INSERT INTO subjects (subject_id, academic_year, subject_name, required_flg, credit, time) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, subject.getSubjectId());
            pstmt.setString(2, subject.getAcademicYear());
            pstmt.setString(3, subject.getSubjectName());
            pstmt.setBoolean(4, subject.getRequiredFlg());
            pstmt.setInt(5, subject.getCredit());
            pstmt.setInt(6, subject.getTime());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 科目の取得
    public Subject getSubjectById(String subjectId) throws SQLException {
        String query = "SELECT * FROM subjects WHERE subject_id = ?";
        Subject subject = null;

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, subjectId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    subject = new Subject();
                    subject.setSubjectId(rs.getString("subject_id"));
                    subject.setAcademicYear(rs.getString("academic_year"));
                    subject.setSubjectName(rs.getString("subject_name"));
                    subject.setRequiredFlg(rs.getBoolean("required_flg"));
                    subject.setCredit(rs.getInt("credit"));
                    subject.setTime(rs.getInt("time"));
                }
            }
            pstmt.close();
        }

		connection.close();

        return subject;
    }

    // 科目の更新
    public void updateSubject(Subject subject) throws SQLException {
        String query = "UPDATE subjects SET academic_year = ?, subject_name = ?, required_flg = ?, credit = ?, time = ? WHERE subject_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, subject.getAcademicYear());
            pstmt.setString(2, subject.getSubjectName());
            pstmt.setBoolean(3, subject.getRequiredFlg());
            pstmt.setInt(4, subject.getCredit());
            pstmt.setInt(5, subject.getTime());
            pstmt.setString(6, subject.getSubjectId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 科目の削除
    public void deleteSubject(String subjectId) throws SQLException {
        String query = "DELETE FROM subjects WHERE subject_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, subjectId);
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }
}

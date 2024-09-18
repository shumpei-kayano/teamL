package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Grades;

public class GradesDAO extends DAO {
    private Connection connection;

    // コンストラクタ
    public GradesDAO(Connection connection) {
        this.connection = connection;
    }

    // 全件取得
    public List<Grades> getAllGrades() throws SQLException {
        List<Grades> grades = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM grades");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Grades grade = new Grades();
                grade.setGradesId(rs.getString("grades_id"));
                grade.setEntYear(rs.getString("ent_year"));
                grade.setAcademicYear(rs.getString("academic_year"));
                grade.setMonth(rs.getString("month"));
                grade.setSubjectId(rs.getString("subject_id"));
                grade.setStudentId(rs.getString("student_id"));
                grade.setScore(rs.getInt("score"));
                grades.add(grade);
            }
            stmt.close();
        }

		connection.close();

        return grades;
    }

    // 成績１件の追加
    public void createGrade(Grades grade) throws SQLException {
        String query = "INSERT INTO grades (grades_id, ent_year, academic_year, month, subject_id, student_id, score) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, grade.getGradesId());
            pstmt.setString(2, grade.getEntYear());
            pstmt.setString(3, grade.getAcademicYear());
            pstmt.setString(4, grade.getMonth());
            pstmt.setString(5, grade.getSubjectId());
            pstmt.setString(6, grade.getStudentId());
            pstmt.setInt(7, grade.getScore());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 成績の取得
    public Grades getGradeById(String gradesId) throws SQLException {
        String query = "SELECT * FROM grades WHERE grades_id = ?";
        Grades grade = null;

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, gradesId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    grade = new Grades();
                    grade.setGradesId(rs.getString("grades_id"));
                    grade.setEntYear(rs.getString("ent_year"));
                    grade.setAcademicYear(rs.getString("academic_year"));
                    grade.setMonth(rs.getString("month"));
                    grade.setSubjectId(rs.getString("subject_id"));
                    grade.setStudentId(rs.getString("student_id"));
                    grade.setScore(rs.getInt("score"));
                }
            }
            pstmt.close();
        }

		connection.close();

        return grade;
    }

    // 成績の更新
    public void updateGrade(Grades grade) throws SQLException {
        String query = "UPDATE grades SET ent_year = ?, academic_year = ?, month = ?, subject_id = ?, student_id = ?, score = ? WHERE grades_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, grade.getEntYear());
            pstmt.setString(2, grade.getAcademicYear());
            pstmt.setString(3, grade.getMonth());
            pstmt.setString(4, grade.getSubjectId());
            pstmt.setString(5, grade.getStudentId());
            pstmt.setInt(6, grade.getScore());
            pstmt.setString(7, grade.getGradesId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 成績の削除
    public void deleteGrade(String gradesId) throws SQLException {
        String query = "DELETE FROM grades WHERE grades_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, gradesId);
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }
}

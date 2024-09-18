package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.School;

public class SchoolDAO extends DAO {
    private Connection connection;

    // コンストラクタ
    public SchoolDAO(Connection connection) {
        this.connection = connection;
    }

    // 全件取得
    public List<School> getAllSchools() throws SQLException {
        List<School> schools = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM schools");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                School school = new School();
                school.setSchoolId(rs.getString("school_id"));
                school.setSchoolName(rs.getString("school_name"));
                schools.add(school);
            }
            stmt.close();
        }

		connection.close();

        return schools;
    }

    // 学校の追加
    public void createSchool(School school) throws SQLException {
        String query = "INSERT INTO schools (school_id, school_name) VALUES (?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, school.getSchoolId());
            pstmt.setString(2, school.getSchoolName());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 学校１件の取得
    public School getSchoolById(String schoolId) throws SQLException {
        String query = "SELECT * FROM schools WHERE school_id = ?";
        School school = null;

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, schoolId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    school = new School();
                    school.setSchoolId(rs.getString("school_id"));
                    school.setSchoolName(rs.getString("school_name"));
                }
            }
            pstmt.close();
        }

		connection.close();

        return school;
    }

    // 学校の更新
    public void updateSchool(School school) throws SQLException {
        String query = "UPDATE schools SET school_name = ? WHERE school_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, school.getSchoolName());
            pstmt.setString(2, school.getSchoolId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 学校の削除
    public void deleteSchool(String schoolId) throws SQLException {
        String query = "DELETE FROM schools WHERE school_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, schoolId);
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }
}

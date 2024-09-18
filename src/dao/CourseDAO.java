package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Course;

public class CourseDAO extends DAO {
    private Connection connection;

    // コンストラクタ
    public CourseDAO(Connection connection) {
        this.connection = connection;
    }

    // 全件取得
    public List<Course> getAllCourses() throws SQLException {
        List<Course> courses = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM courses");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Course course = new Course();
                course.setCourseId(rs.getString("course_id"));
                course.setCourseName(rs.getString("course_name"));
                courses.add(course);
            }
            stmt.close();
        }

		connection.close();

        return courses;
    }

    // コースの追加
    public void createCourse(Course course) throws SQLException {
        String query = "INSERT INTO courses (course_id, course_name) VALUES (?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, course.getCourseId());
            pstmt.setString(2, course.getCourseName());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // コース１件の取得
    public Course getCourseById(String courseId) throws SQLException {
        String query = "SELECT * FROM courses WHERE course_id = ?";
        Course course = null;

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, courseId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    course = new Course();
                    course.setCourseId(rs.getString("course_id"));
                    course.setCourseName(rs.getString("course_name"));
                }
            }
            pstmt.close();
        }

		connection.close();

        return course;
    }

    // コースの更新
    public void updateCourse(Course course) throws SQLException {
        String query = "UPDATE courses SET course_name = ? WHERE course_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, course.getCourseName());
            pstmt.setString(2, course.getCourseId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // コースの削除
    public void deleteCourse(String courseId) throws SQLException {
        String query = "DELETE FROM courses WHERE course_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, courseId);
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }
}

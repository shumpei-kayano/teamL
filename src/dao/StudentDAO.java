package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class StudentDAO extends DAO {
    private Connection connection;

    // コンストラクタ
    public StudentDAO(Connection connection) {
        this.connection = connection;
    }

    // 全件取得
    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM students");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Student student = new Student();
                student.setStudentId(rs.getString("student_id"));
                student.setStudentName(rs.getString("student_name"));
                student.setClassNum(rs.getString("class_num"));
                student.setEntYear(rs.getString("ent_year"));
                student.setCourseId(rs.getString("course_id"));
                student.setDropoutDate(rs.getDate("dropout_date"));
                student.setKunkokuDate(rs.getDate("kunkoku_date"));
                student.setKaikokuDate(rs.getDate("kaikoku_date"));
                student.setSaikaikokuDate(rs.getDate("saikaikoku_date"));
                student.setTaigakuKankokuDate(rs.getDate("taigaku_kankoku_date"));
                student.setTokutaigakuDate(rs.getDate("tokutaigaku_date"));
                students.add(student);
            }
            stmt.close();
        }

		connection.close();

        return students;
    }

    // 学生の追加
    public void createStudent(Student student) throws SQLException {
        String query = "INSERT INTO students (student_id, student_name, class_num, ent_year, course_id, dropout_date, kunkoku_date, kaikoku_date, saikaikoku_date, taigaku_kankoku_date, tokutaigaku_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, student.getStudentId());
            pstmt.setString(2, student.getStudentName());
            pstmt.setString(3, student.getClassNum());
            pstmt.setString(4, student.getEntYear());
            pstmt.setString(5, student.getCourseId());
            pstmt.setDate(6, new java.sql.Date(student.getDropoutDate().getTime()));
            pstmt.setDate(7, new java.sql.Date(student.getKunkokuDate().getTime()));
            pstmt.setDate(8, new java.sql.Date(student.getKaikokuDate().getTime()));
            pstmt.setDate(9, new java.sql.Date(student.getSaikaikokuDate().getTime()));
            pstmt.setDate(10, new java.sql.Date(student.getTaigakuKankokuDate().getTime()));
            pstmt.setDate(11, new java.sql.Date(student.getTokutaigakuDate().getTime()));
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 学生１件の取得
    public Student getStudentById(String studentId) throws SQLException {
        String query = "SELECT * FROM students WHERE student_id = ?";
        Student student = null;

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, studentId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    student = new Student();
                    student.setStudentId(rs.getString("student_id"));
                    student.setStudentName(rs.getString("student_name"));
                    student.setClassNum(rs.getString("class_num"));
                    student.setEntYear(rs.getString("ent_year"));
                    student.setCourseId(rs.getString("course_id"));
                    student.setDropoutDate(rs.getDate("dropout_date"));
                    student.setKunkokuDate(rs.getDate("kunkoku_date"));
                    student.setKaikokuDate(rs.getDate("kaikoku_date"));
                    student.setSaikaikokuDate(rs.getDate("saikaikoku_date"));
                    student.setTaigakuKankokuDate(rs.getDate("taigaku_kankoku_date"));
                    student.setTokutaigakuDate(rs.getDate("tokutaigaku_date"));
                }
            }
            pstmt.close();
        }

		connection.close();

        return student;
    }

    // 学生の更新
    public void updateStudent(Student student) throws SQLException {
        String query = "UPDATE students SET student_name = ?, class_num = ?, ent_year = ?, course_id = ?, dropout_date = ?, kunkoku_date = ?, kaikoku_date = ?, saikaikoku_date = ?, taigaku_kankoku_date = ?, tokutaigaku_date = ? WHERE student_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, student.getStudentName());
            pstmt.setString(2, student.getClassNum());
            pstmt.setString(3, student.getEntYear());
            pstmt.setString(4, student.getCourseId());
            pstmt.setDate(5, new java.sql.Date(student.getDropoutDate().getTime()));
            pstmt.setDate(6, new java.sql.Date(student.getKunkokuDate().getTime()));
            pstmt.setDate(7, new java.sql.Date(student.getKaikokuDate().getTime()));
            pstmt.setDate(8, new java.sql.Date(student.getSaikaikokuDate().getTime()));
            pstmt.setDate(9, new java.sql.Date(student.getTaigakuKankokuDate().getTime()));
            pstmt.setDate(10, new java.sql.Date(student.getTokutaigakuDate().getTime()));
            pstmt.setString(11, student.getStudentId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 学生の削除
    public void deleteStudent(String studentId) throws SQLException {
        String query = "DELETE FROM students WHERE student_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, studentId);
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }
}

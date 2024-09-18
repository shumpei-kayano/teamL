package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Teacher;

public class TeacherDAO extends DAO {
    private Connection connection;

    // コンストラクタ
    public TeacherDAO(Connection connection) {
        this.connection = connection;
    }

    // 全件取得
    public List<Teacher> getAllTeachers() throws SQLException {
        List<Teacher> teachers = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM teachers");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Teacher teacher = new Teacher();
                teacher.setTeacherId(rs.getString("teacher_id"));
                teacher.setTeacherName(rs.getString("teacher_name"));
                teacher.setClassNum(rs.getString("class_num"));
                teacher.setLoginId(rs.getString("login_id"));
                teacher.setPassword(rs.getString("password"));
                teacher.setGrantFlg(rs.getBoolean("grant_flg"));
                teacher.setDeadlineSetFlg(rs.getBoolean("deadline_set_flg"));
                teacher.setDeadline(rs.getDate("deadline"));
                teachers.add(teacher);
            }
            stmt.close();
        }

		connection.close();

        return teachers;
    }

    // 教師の追加
    public void createTeacher(Teacher teacher) throws SQLException {
        String query = "INSERT INTO teachers (teacher_id, teacher_name, class_num, login_id, password, grant_flg, deadline_set_flg, deadline) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, teacher.getTeacherId());
            pstmt.setString(2, teacher.getTeacherName());
            pstmt.setString(3, teacher.getClassNum());
            pstmt.setString(4, teacher.getLoginId());
            pstmt.setString(5, teacher.getPassword());
            pstmt.setBoolean(6, teacher.getGrantFlg());
            pstmt.setBoolean(7, teacher.getDeadlineSetFlg());
            pstmt.setDate(8, new java.sql.Date(teacher.getDeadline().getTime()));
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 教師１件の取得
    public Teacher getTeacherById(String teacherId) throws SQLException {
        String query = "SELECT * FROM teachers WHERE teacher_id = ?";
        Teacher teacher = null;

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, teacherId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    teacher = new Teacher();
                    teacher.setTeacherId(rs.getString("teacher_id"));
                    teacher.setTeacherName(rs.getString("teacher_name"));
                    teacher.setClassNum(rs.getString("class_num"));
                    teacher.setLoginId(rs.getString("login_id"));
                    teacher.setPassword(rs.getString("password"));
                    teacher.setGrantFlg(rs.getBoolean("grant_flg"));
                    teacher.setDeadlineSetFlg(rs.getBoolean("deadline_set_flg"));
                    teacher.setDeadline(rs.getDate("deadline"));
                }
            }
            pstmt.close();
        }

		connection.close();

        return teacher;
    }

    // 教師の更新
    public void updateTeacher(Teacher teacher) throws SQLException {
        String query = "UPDATE teachers SET teacher_name = ?, class_num = ?, login_id = ?, password = ?, grant_flg = ?, deadline_set_flg = ?, deadline = ? WHERE teacher_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, teacher.getTeacherName());
            pstmt.setString(2, teacher.getClassNum());
            pstmt.setString(3, teacher.getLoginId());
            pstmt.setString(4, teacher.getPassword());
            pstmt.setBoolean(5, teacher.getGrantFlg());
            pstmt.setBoolean(6, teacher.getDeadlineSetFlg());
            pstmt.setDate(7, new java.sql.Date(teacher.getDeadline().getTime()));
            pstmt.setString(8, teacher.getTeacherId());
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }

    // 教師の削除
    public void deleteTeacher(String teacherId) throws SQLException {
        String query = "DELETE FROM teachers WHERE teacher_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, teacherId);
            pstmt.executeUpdate();
            pstmt.close();
        }

		connection.close();
    }
}

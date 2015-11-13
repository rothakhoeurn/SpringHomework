package com.rothaspring.app.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rothaspring.app.entities.Student;
import com.rothaspring.app.service.Service;

@Repository
public class ServiceImpl implements Service {
	@Autowired
	DataSource dataSource;

	@Override
	public boolean insertUser(Student stu) {
		return false;
	}

	@Override
	public boolean updateUser(Student stu) {
		String sql = "UPDATE tbuser SET username=?, email=?, password=?, birthdate=?, registerdate=?, image=? WHERE id=?";
		try(
				Connection conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
			){
				ps.setString(1, stu.getUsername());
				ps.setString(2, stu.getEmail());
				ps.setString(3, stu.getPassword());
				ps.setDate(4, stu.getBirthdate());
				ps.setDate(5, stu.getRegisterdate());
				ps.setString(6, stu.getImage());
				ps.setInt(7, stu.getId());
				if(ps.executeUpdate() > 0){
					return true;
				}
		}catch(SQLException e){
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean deleteUser(int id) {
		String sql = "DELETE FROM tbuser WHERE id=?";

		try (Connection conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);) {

			ps.setInt(1, id);
			if (ps.executeUpdate() > 0){
				return false;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Student> listStudent() {
		String sql = "SELECT id, username, email, password, birthdate, registerdate, image FROM tbuser";
		try (Connection conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();

			ArrayList<Student> listStudent = new ArrayList<Student>();
			Student student;
			while (rs.next()) {

				student = new Student();

				student.setId(rs.getInt("id"));
				student.setUsername(rs.getString("username"));
				student.setEmail(rs.getString("email"));
				student.setPassword(rs.getString("password"));
				student.setBirthdate(rs.getDate("birthdate"));
				student.setRegisterdate(rs.getDate("registerdate"));
				student.setImage(rs.getString("image"));
				listStudent.add(student);
			}
			return listStudent;

		} catch (SQLException ex) {

			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public int getMaxID(String tblName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

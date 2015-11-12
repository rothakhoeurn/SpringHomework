package com.rothaspring.app.service;

import java.util.ArrayList;

import com.rothaspring.app.entities.Student;

public interface Service {
	boolean insertUser(Student stu);
	boolean updateUser(Student stu);
	boolean deleteUser(int id);
	ArrayList<Student> listStudent();
	int getMaxID(String tblName);
	Student getUser(int id);
}

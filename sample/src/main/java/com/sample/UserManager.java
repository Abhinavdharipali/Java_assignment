package com.sample;

import com.sample.models.Employee;
import com.sample.models.User;

import java.util.List;

public interface UserManager {


    void addUser(Employee employee);

    void updateUser(Employee newEmployee);

    List<Employee> listUsers();

    void deleteUser(int empno);

    List<Employee> searchUsers(int id);
}

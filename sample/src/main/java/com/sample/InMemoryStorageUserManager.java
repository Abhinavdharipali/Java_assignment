package com.sample;

import com.sample.models.Employee;
import com.sample.models.User;

import java.util.*;

public class InMemoryStorageUserManager implements UserManager {
    Employee emp=new Employee();
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    List<Employee> employeeList = new ArrayList<Employee>();
    @Override
    public void addUser(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void updateUser(Employee newEmployee) {
        boolean found = false;
        int empno = s.nextInt();

        ListIterator<Employee> li = employeeList.listIterator();
        while(li.hasNext()){
            Employee e = li.next();
            if(e.getEmpno() == newEmployee.getEmpno())  {
                e.setEname(newEmployee.getEname());
                e.setSalary(newEmployee.getSalary());
            }
        }

        if(!found){
            System.out.println("Record Not Found");
        }else{
            System.out.println("Record is Updated Successfully...!");
        }

    }

    @Override
    public List<Employee> listUsers() {
        System.out.println(employeeList);
        return employeeList;
    }


    @Override
    public void deleteUser(int empnum) {
        boolean found = false;
        Iterator<Employee> employeeIterator=employeeList.iterator();
        int empno = s.nextInt();
        System.out.println("----------------------------");

        while(employeeIterator.hasNext()){
            Employee e = employeeIterator.next();
            if(e.getEmpno() == empno)  {
                employeeIterator.remove();
                found = true;
            }
        }

        if(!found){
            System.out.println("Record Not Found");
        }else{
            System.out.println("Record is Deleted Successfully...!");
        }

    }

    @Override
    public List<Employee> searchUsers(int searchId) {
        List<Employee> searchlist=new ArrayList<Employee>();
        boolean found = false;
        int empno = s.nextInt();
        Iterator<Employee> i = employeeList.iterator();
        while (i.hasNext()) {
            Employee e = i.next();
            if (e.getEmpno() == empno) {
                System.out.println(e);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Record Not Found");
        }
        return searchlist;
    }

}

package com.sample.models;

import com.sample.InMemoryStorageUserManager;

import java.util.*;
public class Employee{
        private int empno;
        private String ename;
        private int salary;

        public Employee(int empno, String ename, int salary){
            this.empno = empno;
            this.ename = ename;
            this.salary = salary;
        }
    public Employee(){

    }

        public int getEmpno(){
            return empno;
        }
        public int getSalary(){
            return salary;
        }
        public String getEname(){
            return ename;
        }
        public void setEmpno(int num){
            this.empno=num;
        }
        public void setEname(String name){

        this.ename=name;
        }
        public void setSalary(int sal ){
        this.salary=sal;}

        public String toString(){
            return empno+" "+ename+" "+salary;
        }
    }

    class UserDetails{
        public static void main(String[] args) {
            InMemoryStorageUserManager userManager=new InMemoryStorageUserManager();
            UserDetails user=new UserDetails();

            List<Employee> employeeList = new ArrayList<Employee>();
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);
            int ch;
            do{
                System.out.println("1.INSERT");
                System.out.println("2.DISPLAY");
                System.out.println("3.SEARCH");
                System.out.println("4.DELETE");
                System.out.println("5.UPDATE");
                System.out.print("Enter Your Choice : ");
                ch = s.nextInt();

                switch(ch){
                    case 1:
                        Employee employee=new Employee();
                        System.out.print("Enter Empno : ");
                        employee.setEmpno(s.nextInt());
                        System.out.print("Enter EmpName : ");
                        employee.setEname(s.nextLine());
                        System.out.print("Enter Salary : ");
                        employee.setSalary(s.nextInt());

                        userManager.addUser(employee);
                        break;
                    case 2:
                        System.out.println("----------------------------");
                        userManager.listUsers();
                        System.out.println("----------------------------");
                        break;
                    case 3:
                        System.out.print("Enter Empno to Search :");
                        System.out.println("----------------------------");
                        userManager.searchUsers(1);
                        System.out.println("----------------------------");
                        break;

                    case 4:
                        boolean found = false;
                        System.out.print("Enter Empno to Delete :");

                        System.out.println("----------------------------");
                        userManager.deleteUser(1);

                        System.out.println("----------------------------");
                        break;
                    case 5:
                        Employee newEmployee=new Employee();
                        System.out.print("Enter Empno to Update :");

                        newEmployee.setEmpno(s.nextInt());
                        System.out.print("Enter new Name : ");
                        newEmployee.setEname(s1.nextLine());
                        System.out.print("Enter new Salary : ");
                        newEmployee.setSalary(s.nextInt());
                        userManager.updateUser(newEmployee);
                        }


                        break;


                }while(ch!=0);
            }
        }




package com.studentmanagement.services;

import com.studentmanagement.IO.GetData;
import com.studentmanagement.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServicesImpl implements StudentServices{
    GetData getData=new GetData();

    List<Student> students=getData.getDataTxt();

    Scanner scanner=new Scanner(System.in);
    @Override
    public List<Student> getAllStudent() {
        try {
            if (students.isEmpty()){
                System.out.println("List is empty");
            }else {
            return students;}
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
    @Override
    public void updateStudent(String name) {
        try {
            students.forEach(t->{
                if (name.equals(t.getName())){
                        System.out.println("Enter new RollNo:");
                        String newRollNo = scanner.next();
                        System.out.println("Enter Name or New Name:");
                        String newName = scanner.next();
                        System.out.println("Enter Age:");
                        int newAge = scanner.nextInt();
                        System.out.println("Enter Mark:");
                        Double mark = scanner.nextDouble();
                        t.setRollNo(newRollNo);
                        t.setName(newName);
                        t.setAge(newAge);
                        t.setMark(mark);
                }
            });
////                for (int i = 0; i < students.size(); i++) {
////                    if (name.equals(students.get(i).getName())) {
////                        System.out.println("Enter new RollNo:");
////                        String newRollNo = scanner.next();
////                        System.out.println("Enter Name or New Name:");
////                        String newName = scanner.next();
////                        System.out.println("Enter Age:");
////                        int newAge = scanner.nextInt();
////                        System.out.println("Enter Mark:");
////                        Double mark = scanner.nextDouble();
////
////                        students.get(i).setRollNo(newRollNo);
////                        students.get(i).setName(newName);
////                        students.get(i).setAge(newAge);
////                        students.get(i).setMark(mark);
////                        System.out.println(students.get(i));
//                    }
//                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(String name) {
        try {
            students.forEach(t->{
                if (name.equals(t.getName())){
                    System.out.println("Are you sure?\n1.Yes\n2.No");
                        int choose = scanner.nextInt();
                        switch (choose) {
                            case 1:
                                students.remove(name);
                                System.out.println("Deleted successfully!");
                                break;
                            case 2:
                                System.out.println("The operation has been cancelled!!!");
                            default:
                                System.out.println("Number input invalid!");
                        }
                }
            });


//                for (int i = 0; i < students.size(); i++) {
//                    if (name.equals(students.get(i).getName())) {
//                        System.out.println("Are you sure?\n1.Yes\n2.No");
//                        int choose = scanner.nextInt();
//                        switch (choose) {
//                            case 1:
//                                students.remove(name);
//                                System.out.println("Deleted successfully!");
//                                break;
//                            case 2:
//                                System.out.println("The operation has been cancelled!!!");
//                            default:
//                                System.out.println("Number input invalid!");
//                        }
//                    }
//                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addStudent(String rollNo,String name,int age,double mark) {
        try {


            System.out.println(students);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void searchStudent(String name) {
        try {
            students.forEach(t->{
                if (name.equals(t.getName())){
                    System.out.println(t);
                }
            });


//                for (int i = 0; i < students.size(); i++) {
//                    if (name.equals(students.get(i).getName())) {
//                        System.out.println(students.get(i));
//                    }
//                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

package com.studentmanagement.controller;

import com.studentmanagement.IO.GetData;
import com.studentmanagement.IO.WriteData;
import com.studentmanagement.entity.Student;
import com.studentmanagement.services.StudentServicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    List<Student>students=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public void menu(){

        Scanner sc=new Scanner(System.in);
        try {
            while (true){
                System.out.println("\n\n\nWelcome to Student Management Application");
                System.out.println("\n1.Add Student\n2.Update Student\n3.Delete Student\n4.Search Student\n5.Display All Student\n6.Save \n7.Load from File\n8.Exit\nYour Choice: ");
                int choice= sc.nextInt();
                switch (choice){
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        updateStudent();
                        break;
                    case 3:
                        deleteStudent();
                        break;
                    case 4:
                        searchByName();
                        break;
                    case 5:
                        printList();
                        break;
                    case 6:
                        save();
                        break;
                    case 7:
                        loadFile();
                        break;
                    case 8:
                        System.out.println("Good bye See you again!!!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Input invalid!");
                        break;
                }

            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    public void addStudent(){
        System.out.println("Enter RollNo:");
        String rollNo=scanner.next();
        System.out.println("Enter Name:");
        String name=scanner.next();
        System.out.println("Enter Age:");
        int age= scanner.nextInt();
        System.out.println("Enter mark:");
        double mark= scanner.nextDouble();
        students.add(new Student(rollNo, name, age, mark));

        StudentServicesImpl testName=new StudentServicesImpl();
        testName.addStudent(rollNo,name,age,mark);
    }
    public void updateStudent(){
        System.out.println("Enter Name Student:");
        String name=scanner.nextLine();
        StudentServicesImpl updateStudent=new StudentServicesImpl();
        updateStudent.updateStudent(name);
    }
    public void deleteStudent(){
        System.out.println("Enter Name:");
        String findName= scanner.nextLine();
        StudentServicesImpl deleteStudent=new StudentServicesImpl();
        deleteStudent.deleteStudent(findName);
    }
    public void searchByName(){
        System.out.println("Enter Name:");
        String findName= scanner.nextLine();
        StudentServicesImpl searchStudent=new StudentServicesImpl();
        searchStudent.searchStudent(findName);
    }

    public void save(){WriteData.WriteData(students);}
    public void printList(){
        StudentServicesImpl data=new StudentServicesImpl();
        data.getAllStudent();
    }
    public void loadFile(){
        GetData readFile=new GetData();
//        readFile.getDataTxt();
        students=readFile.getDataTxt();
    }

}

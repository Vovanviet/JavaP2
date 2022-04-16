package com.studentmanagement.IO;

import com.google.gson.Gson;
import com.studentmanagement.entity.Student;

import java.io.*;

import java.util.List;

public class WriteData {
    public static List<Student>WriteData(List<Student> students) {
        try {
            FileWriter myWrite=new FileWriter("Student.json");
                myWrite.write(String.valueOf(students));
                myWrite.close();
            System.out.println("Successfully wrote to the file");
//
//            StringBuilder str = new StringBuilder();
//            FileOutputStream outputStream = new FileOutputStream("Student.json");
//            for(Student student: students){
//                str.append(student.toString());
//                str.toString().split(",");
//            }
//
//            byte[] strToBytes = str.toString().getBytes();
//            outputStream.write(strToBytes);
//
//            outputStream.close();
//            System.out.println("Successfully wrote to the file");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return students;
    }


}

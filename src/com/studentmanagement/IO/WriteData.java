package com.studentmanagement.IO;

import com.studentmanagement.entity.Student;
import com.studentmanagement.services.StudentServicesImpl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteData {
    public static List<Student>WriteData(List<Student> students){
        try {
            FileWriter myWrite=new FileWriter("Student.txt");
                myWrite.write(String.valueOf(students));
                myWrite.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }


}

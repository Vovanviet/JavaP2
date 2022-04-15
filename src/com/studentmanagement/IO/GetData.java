package com.studentmanagement.IO;
import com.studentmanagement.entity.Student;
import java.io.File;
import java.io.FileNotFoundException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetData {
//    public List<String>students;
    public List<Student> getDataTxt() {
        List<String>students=new ArrayList<>();
        try {
            File student = new File("Student.txt");
            Scanner myReader = new Scanner(student);
            while (myReader.hasNextLine()){
              String data= myReader.nextLine();
                students.add(data);
                System.out.println(students);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
      return students;
    }


}

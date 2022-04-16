package com.studentmanagement.IO;
import com.google.gson.JsonObject;
import com.studentmanagement.entity.Student;

import java.io.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;


public class GetData {
    public List<Student>students;
    public List<Student> getDataTxt() {
        try {
            //list that holds strings of a file
            List<String> listOfStrings = new ArrayList<String>();
            // load data from file
            BufferedReader bf = new BufferedReader(new FileReader("Student.json"));
            // read entire line as string
            String line = bf.readLine();
             //checking for end of file
            while (line != null) {
                listOfStrings.add(line);
                line = bf.readLine();
            }
            // closing bufferreader object
            bf.close();
            // storing the data in arraylist to array
            String[] array = listOfStrings.toArray(new String[0]);
            // printing each line of file
            // which is stored in array
            for (String str : array) {
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

//    public static void main(String[] args) {
//        GetData getData=new GetData();
//        getData.getDataTxt();
//        getData.students.get(0);
//    }

}
//            FileReader student = new FileReader("Student.json");
//            Type obj=new TypeToken<List<Student>>(){}.getType();
//            Gson gson=new Gson();
//            students=gson.fromJson(student,obj);
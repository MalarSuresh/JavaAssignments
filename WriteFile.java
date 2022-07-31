package com.learnJava.week2.Assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {

    public static void writeFile() throws IOException {
        String filePath = "/JavaAssignments/Invalid.csv";

        FileWriter fw = null;
        try {
            fw = new FileWriter(filePath,true);
            fw.append("Data Appended");
            fw.append("\n");
            //System.out.println("Data Appended");
        } catch (IOException e) {
            e.printStackTrace();
        }
     finally {
            fw.close();
        }

    }
}

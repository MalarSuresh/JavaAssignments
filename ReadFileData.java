package com.learnJava.week2.Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReadFileData {
    private static String filePath = "/JavaAssignments/CustomerWatchTime.csv";
    public static int n=0;
    public static int m=0;
    public static int i=0;
    public static int j=0;
    public static void FetchData(List<List<String>> values) {
        n = values.size();
        m = values.get(i).size()-1;
        //System.out.println(n+"  "+m);
        for(int j=0;j<m;j++){
           // System.out.println(values.get(i).get(j));
        }
        for(int i=0;i<n;i++) {
                ValidateData.checkId(values.get(i));
        }
        //ValidateData.Validate(values);
    }


    public static void ReadFile(List<List<String>> values) throws IOException {
        BufferedReader fileRead = null;
        int rowsAffected = 0;
        File file = new File(filePath);
        try {
            fileRead = new BufferedReader(new FileReader(filePath));
            String line = null;
            int iteration = 0;
            while ((line = fileRead.readLine()) != null) {
                if (iteration == 0) {
                    iteration++;
                    continue;
                }
                String[] data = line.split(",");
                values.add(Arrays.asList(data));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (fileRead != null) fileRead.close();
        }
    }
}

package com.learnJava.week2.Assignment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TriggerMain {

    public static void main(String[] args) throws IOException {
        List<List<String>> values = new ArrayList<>();
        ReadFileData.ReadFile(values);
        ReadFileData.FetchData(values);
    }
}

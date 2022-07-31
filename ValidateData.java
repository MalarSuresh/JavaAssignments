package com.learnJava.week2.Assignment;

import java.io.IOException;
import java.util.List;

public class ValidateData {
    public static int i=0;
    public static int j=0;
    public static void Validate(List<List<String>> values) {

      // System.out.println(values);
    }

    public static void checkId(List<String> values){
        System.out.println(values);
        int EntryId= Integer.parseInt(values.get(0));
        int CustId= Integer.parseInt(values.get(1));
        String FirstName=values.get(2);
        String LastName=values.get(3);
        int StartTime=Integer.parseInt(values.get(4));
        int EndTime=Integer.parseInt(values.get(5));
        int ChnlNo=Integer.parseInt(values.get(6));
        int CustAge=Integer.parseInt(values.get(7));
        if(EntryId <= 0){
            System.out.println("Original data: " +values);
            System.out.println("Invalid EntryId");
        }else
        {
            System.out.println("Valid EntryID");
        }

        if(CustId <= 0){
            System.out.println("Original data: " +values);
            System.out.println("Invalid CustId");
        }
        else
        {
            System.out.println("Valid CustID");
        }
       if (FirstName.matches("[a-zA-Z]+")&&FirstName.length()<30)
       {
           System.out.println("Valid FirstName");
       }else
       {
           System.out.println("InValid FirstName");
       }
        if (LastName.matches("[a-zA-Z]+")&&LastName.length()<30)
        {
            System.out.println("Valid LastName");
        }else {
            System.out.println("InValid LastName");
        }
        if (ChnlNo > 100 && ChnlNo < 1500){
            System.out.println("Valid ChannelNo.");
        }else{
            System.out.println("InValid ChannelNo.");
        }
        int ST_hour = StartTime/100;
        int ST_min = StartTime%100;
        if((ST_hour<24)&&(ST_min<60)){
            System.out.println(ST_hour+ "  "+ST_min+" is valid");
        }else{
            System.out.println("Invalid StartTime");
        }
        int ET_hour = EndTime/100;
        int ET_min = EndTime%100;
        if((ET_hour<24)&&(ET_min<60)&&EndTime>StartTime){
            System.out.println(ET_hour+ "  "+ET_min+" is valid");
        }else{
            System.out.println("Invalid EndTime");
        }
        if (CustAge >= 15 && CustAge <= 121){
            System.out.println("Valid CustAge");
        }else{
            System.out.println("InValid CustAge");
        }
        try {
            WriteFile.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.harman.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        try
        {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","");
        Scanner input = new Scanner(System.in);
        String name,rollnum,admnum,college;
        System.out.println("enter the name");
        name=input.next();
        System.out.println("enter the rollnum");
        rollnum=input.next();
        System.out.println("enter the admnum");
        admnum=input.next();
        System.out.println("enter the college");
        college=input.next();
            Statement stnt = c.createStatement();
            stnt.executeUpdate("INSERT INTO `student`( `name`, `rollnum`, `admnum`, `college`) " +
                    "VALUES('"+name+"',"+rollnum+","+admnum+",'"+college+"')");
            System.out.println("inserted successfully");

    }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

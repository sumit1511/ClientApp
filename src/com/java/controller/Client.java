package com.java.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
         try{
             String  searchUrl="http://localhost:8080/RegistrationForm/StudentRegistrationSearch?";
             String studentRollNumber;
             Scanner scanner = new Scanner(System.in);
             studentRollNumber = scanner.next();
             searchUrl=searchUrl+"studentSearchRollNumber="+studentRollNumber;
             URL url= new URL(searchUrl);
             HttpURLConnection connection = (HttpURLConnection) (url.openConnection());
             connection.setRequestMethod("GET");
             BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
             String line = in.readLine();
             System.out.println(line);

         }
         catch (IOException e) {
             e.printStackTrace();
         }

    }
}

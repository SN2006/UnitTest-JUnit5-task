package com.example.view;

import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    private String getData(){
        return scanner.nextLine();
    }

    public String getTemperature(){
        System.out.println("Enter current temperature: ");
        return getData();
    }

    public void getOutput(String output){
        System.out.println(output);
    }

}

package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Saint\\Desktop\\test.txt.txt")){
           

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

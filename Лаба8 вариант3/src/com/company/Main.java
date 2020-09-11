package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Saint\\Desktop\\test.txt.txt")){
            System.out.println("Введите текст:");
            Scanner sc = new Scanner(System.in);
            String stroke = sc.nextLine();
            writer.write(stroke);
            System.out.println("Текст успешно записан в файл");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

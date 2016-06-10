package io.demo;

import java.io.*;

public class IoDemo {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("test.txt"), "KOI8-r"
            ))
        ) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

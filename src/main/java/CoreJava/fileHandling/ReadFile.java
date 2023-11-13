package CoreJava.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

    public static void main(String[] args) throws IOException {

        // Represent the file
        File file = new File("Documents\\Test File For Checked Exception.txt"); // This is shortcut path of representing file name. Only condition file need to be a part of the project.

        if (file.exists()) {
            System.out.println("File Does Exists");
            System.out.println(file.getAbsolutePath());
        } else {
            System.out.println("File Not Exists");
        }

        // Reading the file
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        // Reading the line in the file
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        // To Close the BufferedReader memory
        br.close();
    }
}

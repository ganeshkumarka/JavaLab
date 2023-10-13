/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question4;

/**
 *
 * @author ganes
 */
import java.io.*;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Get the source file name
            System.out.print("Enter the source file name (without package path): ");
            String sourceFileName = reader.readLine();

            // Get the target file name
            System.out.print("Enter the target file name (without package path): ");
            String targetFileName = reader.readLine();

            // Construct the full file paths based on the package structure
            String sourceFilePath = "src/main/resources/" + sourceFileName;
            String targetFilePath = "src/main/resources/" + targetFileName;

            File sourceFile = new File(sourceFilePath);
            File targetFile = new File(targetFilePath);

            // Check if the source file exists
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            // Check if the target file exists
            if (targetFile.exists()) {
                System.out.print("Target file already exists. Do you want to overwrite? (yes/no): ");
                String confirmation = reader.readLine().toLowerCase();

                if (!confirmation.equals("yes")) {
                    System.out.println("File copy aborted.");
                    return;
                }
            }

            // Perform the file copy
            try (InputStream inStream = new FileInputStream(sourceFile);
                 OutputStream outStream = new FileOutputStream(targetFile)) {

                byte[] buffer = new byte[1024];
                int length;

                while ((length = inStream.read(buffer)) > 0) {
                    outStream.write(buffer, 0, length);
                }

                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.out.println("Error copying file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



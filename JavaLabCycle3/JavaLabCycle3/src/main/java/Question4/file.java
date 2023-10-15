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

public class file {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Get the source and target file names from the user
            System.out.print("Enter the source file name: ");
            String sourceFileName = reader.readLine();

            System.out.print("Enter the target file name: ");
            String targetFileName = reader.readLine();

            File sourceFile = new File(sourceFileName);
            File targetFile = new File(targetFileName);

            // Check if the source file exists
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            // Check if the target file already exists
            if (targetFile.exists()) {
                // Ask for confirmation to overwrite
                System.out.print("Target file already exists. Overwrite? (yes/no): ");
                String confirm = reader.readLine().toLowerCase();
                
                if (!confirm.equals("yes")) {
                    System.out.println("File not copied.");
                    return;
                }
            }

            // Perform the file copy
            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(targetFile);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

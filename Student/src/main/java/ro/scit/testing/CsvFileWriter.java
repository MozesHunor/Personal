package main.java.ro.scit.testing;


import java.io.FileWriter;
import java.io.IOException;


public class CsvFileWriter {
    private static final String fileHeader = "<Name> <Grade> \n";

    public static void writeCsvFile(String fileName) {

        Catalog catalog = new Catalog();

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.append(fileHeader);
            for (Student students : catalog.getStudents()) {
                fileWriter.append(String.valueOf(students.getName()));
                fileWriter.append(",");
                fileWriter.append(String.valueOf(students.getGrade()));
                fileWriter.append("\n");
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter");
                e.printStackTrace();
            }
        }
    }

}




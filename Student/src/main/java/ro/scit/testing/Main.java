package main.java.ro.scit.testing;

public class Main {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        catalog.populateCatalog();
        CsvFileWriter.writeCsvFile("students");
        catalog.deleteOldCatalog();

        catalog.changeGradeOfAStudent("John Doe", 10.0);
        catalog.addNewStudent("I am new here", 5.0);
        catalog.addNewStudent("I am new here too", 0.0);
        catalog.readGradeOfStudent("John Doe");
        catalog.deleteGradeOfStudent("I am new here");
        catalog.addGradeToStudent("I am new here too", 6.7);
        CsvFileWriter.writeCsvFile("students");

    }
}

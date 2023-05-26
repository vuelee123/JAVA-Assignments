package DAY59and60.ProjectIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the directory:");
        String inputPath = scanner.nextLine();

        try {
            Path dirPath = Paths.get(inputPath);
            if (!Files.isDirectory(dirPath)) {
                System.out.println("Invalid directory path.");
                return;
            }
            boolean exit = false;

            while (!exit) {
                System.out.println("\nSelect an option:");
                System.out.println("1. Display directory contents");
                System.out.println("2. Copy file");
                System.out.println("3. Move file");
                System.out.println("4. Delete file");
                System.out.println("5. Create directory");
                System.out.println("6. Delete directory");
                System.out.println("7. Search for files");
                System.out.println("8. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        String directoryPath = scanner.nextLine();
                        displayDirectoryContents(Path.of(directoryPath));
                        break;
                    case 2:
                        System.out.println("Enter the source file name:");
                        String sourceFilePath = scanner.nextLine();
                        System.out.println("Enter the target file name:");
                        String destinationDirectoryPath = scanner.nextLine();
                        copyFile(sourceFilePath, destinationDirectoryPath);
                        break;
                    case 3:
                        System.out.println("Enter the source file name:");
                        String moveSourceFilePath = scanner.nextLine();
                        System.out.println("Enter the target file name:");
                        String moveDestinationFilePath = scanner.nextLine();
                        moveFile(moveSourceFilePath, moveDestinationFilePath);
                        break;
                    case 4:
                        System.out.println("Enter the file name to delete:");
                        String fileToDelete = scanner.nextLine();
                        deleteFile(dirPath.resolve(fileToDelete));
                        break;
                    case 5:
                        System.out.println("Enter the name of the new directory:");
                        String newDir = scanner.nextLine();
                        createDirectory(dirPath.resolve(newDir));
                        break;
                    case 6:
                        System.out.println("Enter the name of the directory to delete:");
                        String dirToDelete = scanner.nextLine();
                        deleteDirectory(dirPath.resolve(dirToDelete));
                        break;
                    case 7:
                        System.out.println("Enter the file name or extension to search for:");
                        String searchTerm = scanner.nextLine();
                        searchFiles(dirPath, searchTerm);
                        break;
                    case 8:
                        exit = true;
                        break;
                    default:
                        System.out.println("Option not valid.");
                }
            }
        } catch (InvalidPathException e) {
            System.out.println("Invalid path: " + e.getMessage());
        }
    }
    private static void displayDirectoryContents(Path dirPath) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)) {
            System.out.println("\nDirectory contents:");
            for (Path entry : stream) {
                BasicFileAttributes attrs = Files.readAttributes(entry, BasicFileAttributes.class);
                String type = attrs.isDirectory() ? "DIR" : "FILE";
                long size = attrs.size();
                LocalDateTime lastModified = LocalDateTime.ofInstant(attrs.lastModifiedTime().toInstant(), ZoneOffset.UTC);
                System.out.printf("%-10s %-10d %-20s %s%n", type, size, lastModified.format(formatter), entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error! Cannot read the directory contents: " + e.getMessage());
        }
    }
    private static void copyFile(String sourceFilePath, String destinationDirectoryPath) {
        try {
            Path sourcePath = Paths.get(sourceFilePath);
            Path destinationPath = Paths.get(destinationDirectoryPath, sourcePath.getFileName().toString());
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error! Cannot copy file: " + e.getMessage());
        }
    }
    private static void moveFile(String sourceFilePath, String destinationFilePath) {
        try {
            Path sourcePath = Paths.get(sourceFilePath);
            Path destinationPath = Paths.get(destinationFilePath);
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully!");
        } catch (IOException e) {
            System.out.println("Error! Cannot move file: " + e.getMessage());
        }
    }
    private static void deleteFile(Path file) {
        try {
            Files.delete(file);
            System.out.println("File has been deleted.");
        } catch (IOException e) {
            System.out.println("Error! Cannot delete file: " + e.getMessage());
        }
    }
    private static void createDirectory(Path dir) {
        try {
            Files.createDirectory(dir);
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            System.out.println("Error! Cannot create directory: " + e.getMessage());
        }
    }
    private static void deleteDirectory(Path dir) {
        try {
            Files.delete(dir);
            System.out.println("Directory deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error! Cannot delete directory: " + e.getMessage());
        }
    }
    private static void searchFiles(Path dir, String searchTerm) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, searchTerm)) {
            System.out.println("\nSearch results:");
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error searching for files: " + e.getMessage());
        }
    }
}
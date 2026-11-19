import java.io.File;
import java.util.Scanner;

public class Task4 {

    public static long calculateSize(File directory) {

        long totalSize = 0;

        File[] files = directory.listFiles();

        if (files != null) {

            for (File file : files) {

                if (file.isFile()) {
                    totalSize += file.length();
                }

                else if (file.isDirectory()) {
                    totalSize += calculateSize(file);
                }
            }
        }

        return totalSize;
    }

    public static void displaySize(String name, long size) {

        System.out.println("\nDirectory: " + name);
        System.out.println("Bytes: " + size);
        System.out.println("KB: " + size / 1024.0);
        System.out.println("MB: " +
                size / (1024.0 * 1024.0));
    }

    public static void showDirectorySizes(File directory) {

        File[] files = directory.listFiles();

        if (files != null) {

            for (File file : files) {

                if (file.isDirectory()) {

                    long size = calculateSize(file);

                    displaySize(file.getName(), size);

                    showDirectorySizes(file);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory path: ");

        String path = input.nextLine();

        File directory = new File(path);

        if (!directory.exists() || !directory.isDirectory()) {

            System.out.println(
                    "Error: Directory does not exist!");

        } else {

            long totalSize = calculateSize(directory);

            System.out.println("\nTotal Directory Size:");

            displaySize(directory.getName(), totalSize);

            System.out.println(
                    "\nIndividual Directory Sizes:");

            showDirectorySizes(directory);
        }

        input.close();
    }
}
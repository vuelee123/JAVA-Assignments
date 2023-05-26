package DAY59and60.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
    public class Main {
        public static void main(String[] args) {
            List<Integer> list1 = readFile("src/input1.txt");
            List<Integer> list2 = readFile("src/input2.txt");

            List<Integer> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);
            writeFile("src/merged.txt", mergedList);

            list1.retainAll(list2);
            writeFile("src/common.txt", list1);
        }

        private static List<Integer> readFile(String filename) {
            List<Integer> list = new ArrayList<>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = reader.readLine()) != null) {
                    list.add(Integer.parseInt(line));
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.err.println("File not found: " + filename);
            } catch (IOException e) {
                System.err.println("Error reading file: " + filename);
            } catch (NumberFormatException e) {
                System.err.println("Invalid number format in file: " + filename);
            }
            return list;
        }

        private static void writeFile(String filename, List<Integer> list) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
                for (int num : list) {
                    writer.write(Integer.toString(num));
                    writer.newLine();
                }
                writer.close();
            } catch (IOException e) {
                System.err.println("Error writing to file: " + filename);
            }
        }
    }
package ru.geekbrains.java_one;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.Scanner;

public class Main {

    private static Scanner SCANNER = new Scanner(System.in);
    private static String fileText = "";
    private static String[] filesContent;

    // Создание или запись в файл
    public static void writeFile(String nameFile, int i) throws IOException {
        PrintStream save = new PrintStream(new FileOutputStream(nameFile, true));
        if (i == 1) {
            save.println(fileText);
            fileText = "";
        } else
            save.println(SCANNER.nextLine());
        save.close();
    }

    // Посимвольное чтение из файла
    public static void loadFile(String nameFile) throws IOException {
        fileText = "";
        FileInputStream load = new FileInputStream(nameFile);
        int a;
        while ((a = load.read()) != -1)
            fileText += (char) a;
        load.close();
    }

    // Поиск слова в файле
    public static boolean find(String nameFile, String word) throws IOException {
        FileInputStream load = new FileInputStream(nameFile);
        int a;
        String wordFile = "";
        while ((a = load.read()) != -1) {
            if ((char) a == word.charAt(0)) {
                wordFile += (char) a;
                for (int i = 1; i < word.length(); i++) {
                    a = load.read();
                    wordFile += (char) a;
                }
                if (wordFile.equals(word))
                    return true;
                wordFile = "";
            }
        }
        return false;
    }

    // Поиск слова в папке
    public static void findInDir(String word) throws IOException {
        try {
            File folder = new File(".");
            File[] files = folder.listFiles();
            int e = 0;
            filesContent = new String[files.length];
            for (File file : files) {
                if (!file.isDirectory()) {
                    if (find(file.getName(), word)) {
                        filesContent[e] = file.getName();
                        e++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String nameFile = "file_1.txt";
        String word = "and";
        try {

            writeFile("file_1.txt", 0);
            writeFile("file_2.txt", 0);

            loadFile("file_2.txt");
            writeFile("file_1.txt", 1);

            if (find(nameFile, word))
                System.out.println("Файл '" + nameFile + "' содержит слово '" + word + "'");
            else
                System.out.println("Файл '" + nameFile + "' не содержит слово '" + word + "'");

            findInDir(word);
            if (filesContent[0] != null) {
                System.out.println("Эти файлы содержат слово '" + word + "'");
                for (int i = 0; i < filesContent.length; i++) {
                    if (filesContent[i] != null)
                        System.out.println(filesContent[i]);
                }
            } else {
                System.out.println("Нет совпадений");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}